<%-- 
    Document   : CollegeAddtour
    Created on : Aug 13, 2018, 11:46:35 AM
    Author     : ECIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Tournaments</title>
        <link href="css/clgaddtour.css" rel="stylesheet">
    </head>
    <body><div class="add"><form action="CollegeaddTaction.jsp">
                <h1> College Level Tournament</h1>
       <div class="inputbox"><input type="text" name="Tname" value="" required><label>Tournament Name</label></div>
       <div class="drop"><select name="Sname" required>
           <option>Cricket</option>
           <option>Football</option>
           <option>Volleyball</option>
           <option>Badminton</option>
           <option>Running</option>
           <option>Kabbadi</option>
           </select></div>
       <div class="inputbox"><input type="text" name="venue" value="" required><label>College Name</label></div>   
       <div class="inputbox"><input type="date" name="start" value="" required></div>To<div class="inputbox"><input type="date" name="end" value="" required></div>
       <p><input type="submit" value="ADD"></p>
</form>
        <form action="adminhome.jsp"><input type="submit" value="Back"></form></div>
    </body>
</html>