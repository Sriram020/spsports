<%-- 
    Document   : studentlogin
    Created on : 4 Aug, 2018, 9:27:32 AM
    Author     : srira_000
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        <link  href="css/stulog.css" rel="stylesheet" type="text/css">
    </head>
         <body>
            <div class="loginbox">
                <form action="adminlogin" method="POST">
                <h1>Admin Login</h1>
               <div class="inputbox"><p><input type="text" name="Uname" value="" required>
                       <label>Username</label>
               </div>
               <div class="inputbox"><input type="password" name="pswd" value="" required>
                   <label>Password</label>
               </div>
               <input type="submit" name=""value="Login">
                 
             </form>           
               </div>      
    </body>
</html>
