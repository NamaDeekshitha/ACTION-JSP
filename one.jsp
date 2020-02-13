<%!
private String getName()
{
	return "Tilaka Radhakrishnan";
}
private String phone()
{
	return "8919225934";
}
private String getCity()
{
	return "Delhi";
}
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#6E6E6E">
<font size="+7" color="#F2F2F2">
Information about: <%=getName() %>...<br>
Contact Number: <%=phone() %><br>
City:<%=getCity() %>
</font>



</body>
</html>
