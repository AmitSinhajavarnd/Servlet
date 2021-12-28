<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table border="1" cellpadding="5" cellspacing="2">
<form action="prod_entry.jsp" method="post">
<h2>Product Management</h2>

<hr>
<h2>Home  AboutUs  Add Product Details   Show Report  Logout</h2>
<hr>
<a href="retrieve_prod.jsp">Show Report</a>
<tr>
<th>ProductName:</th>
<td><input type="text" name="productname"></td>
</tr>

<tr>
<th>Price:</th>
<td><input type="text" name="price"></td>
</tr>

<tr>
<th>Quantity in Stock:</th>
<td><input type="text" name="stock"></td>
</tr>

<%--
<tr>
<th> Quantity in Stock:
<td>
<select name="stock" id="stock">
  <optgroup label="">
    <option value="ten"></option>
     <option value="ten">10</option>
    <option value="twenty">20</option>
     <option value="thirty">30</option>
    <option value="forty">40</option>
     <option value="fifty">50</option>
    <option value="sixty">60</option>
     <option value="seventy">70</option>
    <option value="eighty">80</option>
    
  </optgroup> 
</select>
</td>
</th>
</tr>
--%>

<tr>
<th>Vendor:</th>
<td><input type="text" name="vendor"></td>
</tr>

<tr>
<th>Warranty:</th>
<td><input type="text" name="warranty"></td>
</tr>
<%--
<tr>
<th> Warranty:
<td>
<select name="warranty" id="warranty">
  <optgroup label="">
    <option value="zero"></option>
     <option value="zero">0</option>
    <option value="one">1</option>
     <option value="two">2</option>
    <option value="three">3</option>
     <option value="four">4</option>
    <option value="five">5</option>
     <option value="six">6</option>
    <option value="seven">7</option>
    
  </optgroup> 
</select>
</td>
</th>
</tr>
 --%>

<td><input type="submit" value="save" ></td>

</table>
</center>
</body>
</html>