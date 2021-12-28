<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String productname=request.getParameter("productname");
String price=request.getParameter("price");
String stock=request.getParameter("stock");
String vendor=request.getParameter("vendor");
String warranty=request.getParameter("warranty");
try
{
	 Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit_db?" + "user=root&password=root");
Statement st=conn.createStatement();
int i=st.executeUpdate("insert into prod_management(Prod_name,price,quantity,vendor,warranty)values('"+productname+"','"+price+"','"+stock+"','"+vendor+"','"+warranty+"')");
out.println("Thank you for the entry, Your entry has been saved. Please <a href='Login_test.jsp'>Login</a> to continue.");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>