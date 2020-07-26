<%-- 
    Document   : passrename
    Created on : 8 Sep, 2018, 5:34:05 PM
    Author     : Sriramkumar
--%>
<%@include file="connection.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Password</title>
        <link rel="stylesheet" href="css/passrename.css">
    </head>
    <body><center>
        <h1 style="color: white;">Rename Password</h1>
        <div class="update"><form action="passrename.jsp">
                <div class="inputbox"><input type="password" name="oldpswd" value="" required>
                   <label>Old Password</label>
        </div>
        <div class="inputbox"><input type="password" name="newpswd" value="" required>
                   <label>New Password</label>
        </div>
        <div class="inputbox"><input type="password" name="renewpswd" value="" required>
                   <label>Re-enter Password</label>
        </div>
                <p><input id="update" type="submit" value="Update"></p>
            </form>
            <form action="staffpro.jsp"><input type="submit" value="Back"></form>
        </div><div style="color: red">
        <%
           String id=(String)session.getAttribute("StaffID");
           String Old=request.getParameter("oldpswd");
           String New=request.getParameter("newpswd");
           String Renew=request.getParameter("renewpswd");
           if(New==Renew)
           {
           PreparedStatement ps=con.prepareStatement("update staffreg set Password=? where StaffID='"+id+"' and Password='"+Old+"'");
          ps.setString(1,New);
                    
          int k=ps.executeUpdate();
          if(k!=0){
         %>
         <b style="color: greenyellow">Updated Successfully</b>
            <%
          }
          else
          {
              out.println("Invalid Entry");
          }
           }
          else
               {
                out.println("Password and Confirm Password are not matched");
               }
           
        %>
        </div> 
        
    </center></body>
</html>

