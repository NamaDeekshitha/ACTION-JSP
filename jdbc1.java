
import java.sql.*;
public class jdbc1 
{
	public static void main(String args[])throws SQLException
	{
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deek","root","root");
		    System.out.println("Connected");
		    ps=con.prepareStatement("insert into employee values(?,?,?,?)");
		    ps.setInt(1,100);
		    ps.setString(2, "Tilaka");
		    ps.setFloat(3, 30000);
		    ps.setInt(4,50);
		    ps.executeUpdate();
		    
		    
		    		/*ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt("eno"));
		       System.out.println(rs.getString("ename"));
		       System.out.println(rs.getFloat("esalary"));
		       System.out.println(rs.getInt("deptno"));
		    }*/
		}
		catch(SQLException |ClassNotFoundException se)
		{
			System.out.println(se);
		}
		finally
		{
			con.setAutoCommit(false);
			con.commit();
			
		}
		
		
		
		
	}
}


