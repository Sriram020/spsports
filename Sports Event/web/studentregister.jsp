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
        <title>Student Registration</title>
        <link href="css/stureg.css" rel="stylesheet" type="text/css">
    </head>
    <body><div class="registerbox"><form action="regaction1.jsp">
                    <h2>Student Registration</h2>
        <div class="inputbox"><input type="text" value="" name="name" required><label>Student Name</label></div>
        <div class="inputbox"><input type="text" value="" name="roll" required><label>Roll Number</label></div>
        <div class="inputbox"><input type="email" value="" name="email" required><label>Email</label></div>
        <div class="inputbox"><input type="text" value="" name="mob" required><label>Mobile</label></div>
        <div class="inputbox"><input type="date" value="" name="DOB" required></div>
        <div class="drop"><select name="sport">
                <option>Cricket</option>
                <option>Football</option>
                <option>Volleyball</option>
                <option>Badminton</option>
                <option>Running</option>
                <option>Kabbadi</option>
            </select><label>Sport</label></div>
        <div class="drop"><select name="level">
            <option>College</option>
            <option>State</option>
        </select><label>Sport Level</label></div>
       <p> <input type="submit" name="" value="Register">      
        </p></form><form action="staffhome.jsp"><input type="submit" value="Back" ></form></div>
        <script language="javascript">
        function Check(form)
        {
            if (form.pswd.value==form.rpswd.value&&form.rpswd.value==form.pswd.value)
                {
                    return(true);
                }
                else
                    {
                        alert("Error:Passwords are not matched");
                        return false;
                    }
        }
        </script>
        <%
          String id=(String)session.getAttribute("StaffID");
          String c=(String)session.getAttribute("College");
        %>
    </body>
</html>
