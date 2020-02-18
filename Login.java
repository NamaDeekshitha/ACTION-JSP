import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet {
	static boolean st =false;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
		request.setAttribute("EmployeeName", email);
		request.setAttribute("EmpPassword", password);
		
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deek","root","root");
            PreparedStatement ps = con.prepareStatement("select * from logic");
            ResultSet rs =ps.executeQuery();
			while(rs.next())
			{

				if(rs.getString("email").equals(email) && rs.getString("password").equals(password))
				{
					st=true;
				}
			}

        }
        catch(ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        
        if(st==true)
        {
        	ServletContext context= getServletContext();
            RequestDispatcher rd = context.getRequestDispatcher("/Uservalidate.html");
            rd.forward(request, response);
        }
        else
        {
           out.println("Username or Password incorrect");
        }   
    }


}

