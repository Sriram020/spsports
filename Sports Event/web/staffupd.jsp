<%-- 
    Document   : staffdel
    Created on : 20 Aug, 2018, 5:24:16 PM
    Author     : Sriramkumar
--%>
<%@page import="java.sql.PreparedStatement"%>
<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
        <link rel="stylesheet" href="css/staffupd.css">
    </head>
    <body>
    <center>
        <form action="staffupd.jsp">
           <div class="update">
                 <h1>Update Staff</h1>
                 <div class="inputbox"><p><input type="text" name="id" value="">
                       <label>StaffID</label>
               </div>
               <div class="inputbox"><p><input type="text" name="Uname" value="">
                       <label>Username</label>
               </div>
                 <div class="inputbox"><input type="email" name="email" value="">
                   <label>Email</label>
               </div>
                 <div class="inputbox"><input type="number" name="phno" value="">
                   <label>Phone Number</label>
               </div>
               <div class="inputbox"><input type="password" name="pswd" value="">
                   <label>Password</label>
               </div>
                 
               <p><input type="submit" name=""value="Update"></p>
                 
             </form> 
        <form action="adminhome.jsp"><input type="submit" value="Back"></form>
</div><div style="color: red">
        <%
          String Id=request.getParameter("id");
          String Name=request.getParameter("Uname");
          String Email=request.getParameter("email");
          String Number=request.getParameter("phno");
          String Password=request.getParameter("pswd");
          
          PreparedStatement ps=con.prepareStatement("update staffreg set Staffname=?,Email=?,Mobile=?,Password=? where StaffID='"+Id+"'");
          ps.setString(1,Name);
          ps.setString(2,Email);
          ps.setString(3,Number);
          ps.setString(4,Password);
          int k=ps.executeUpdate();
           
          if(k!=0)
           {
               %>
           <p>    <b style="color: greenyellow">Updated Successfully</b>
           </p>
           <% 
                 }
           else
          {                 
            out.println("Invalid Entry");
          }
        %>
        </div>
    </center> </body>
    </body>
</html>
