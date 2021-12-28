<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String fname=request.getParameter("login name");
String contact=request.getParameter("contact");
String email=request.getParameter("email");
String userid=request.getParameter("username");
String password=request.getParameter("passwords");
try
{
	 Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit_db?" + "user=root&password=root");
Statement st=conn.createStatement();
int i=st.executeUpdate("insert into new_register(Names,contact,email,username,passwords)values('"+fname+"','"+contact+"','"+email+"','"+userid+"','"+password+"')");
out.println("Thank you for register ! Please <a href='Login_test.jsp'>Login</a> to continue.");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>