
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Staff Login</title>
        <link  href="css/stafflog.css" rel="stylesheet" type="text/css">
    </head>
         <body>
            <div class="loginbox">
                <form  action="loginaction.jsp">
                <h1>Staff Login</h1>
               <div class="inputbox"><p><input type="text" name="stid" value="" required>
                       <label>StaffId</label>
               </div>
               <div class="inputbox"><input type="password" name="pswd" value="" required>
                   <label>Password</label>
               </div>
               <input type="submit" name=""value="Login">
                 
             </form>           
               </div>      
    </body>
</html>
