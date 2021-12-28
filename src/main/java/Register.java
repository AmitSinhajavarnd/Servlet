import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Register extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("login name");  
String p=request.getParameter("contact");  
String e=request.getParameter("email");  
String c=request.getParameter("username");  
String z=request.getParameter("Password");  
          
try{  
	Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit_db?" + "user=root&password=root");   
 
  
PreparedStatement ps=con.prepareStatement(  
"insert into new_register values(?,?,?,?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
ps.setString(3,e);  
ps.setString(4,c);  
ps.setString(5,z);  
          
int i=ps.executeUpdate();  
if(i>0)  
out.print("You are successfully registered...");  
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}  
