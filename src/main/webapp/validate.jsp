<%@ page import ="java.sql.*" %>
<%
    try{
        String username = request.getParameter("username");   
        String password = request.getParameter("password");
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit_db?" + "user=root&password=root");    
        PreparedStatement pst = conn.prepareStatement("Select username,passwords from new_register where username=? and passwords=?");
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery(); 
        out.println("Hi,");
        if(rs.next())           
        	response.sendRedirect("ProductEntry.jsp");
       //out.println("you are logged in sucessfully");     
        
        else
           out.println("Invalid login credentials");            
   }
   catch(Exception e){       
       out.println("Something went wrong !! Please try again");       
   }      
%>