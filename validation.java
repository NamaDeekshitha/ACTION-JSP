

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class validation extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
{
String s1=req.getParameter("num1");
String s2=req.getParameter("num2");
PrintWriter out=res.getWriter();
out.print("username:"+s1+"<br>");
out.print("password:"+s2);
}
}