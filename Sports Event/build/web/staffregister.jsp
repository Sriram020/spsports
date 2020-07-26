<%-- 
    Document   : register
    Created on : Jul 13, 2018, 2:02:41 PM
    Author     : ECIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Staff Register</title>
        <link href="css/staffreg.css" rel="stylesheet" type="text/css">
    </head>
    <body> <div class="reg"><form action="regaction.jsp">
                    <h2>Staff Registration</h2>
        <div class="inputbox"><input type="text" value="" name="name" required><label>Staff Name</label></div>
        <div class="inputbox"><input type="text" value="" name="staffid" required><label>StaffID</label></div>
        <div class="inputbox"><input type="email" value="" name="email" required><label>Email</label></div>
        <div class="inputbox"><input type="text" value="" name="mob" required><label>Mobile</label></div>
        <div class="inputbox"><input type="text" value="" name="clg" required><label>College Name</label></div>
        <div class="inputbox"><input type="date" value="" name="DOB" required></div>
        <div class="inputbox"><input type="password" value="" name="pswd" required><label>Password</label></div>
        <input id="reg" type="submit" value="Register">      
            </form><form action="adminhome.jsp"><p><input type="submit" value="Back"></p></form></div>
        
    </body>
</html>
