<%-- 
    Document   : staffpro
    Created on : 7 Sep, 2018, 5:02:19 PM
    Author     : Sriramkumar
--%>
<%@include file="connection.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link href="css/staffpro.css" rel="stylesheet">
    </head>
    <body style="">
        <center>
            <table border="1" bordercolor="white" style="border-radius: 10px;margin-top: 200px; color: white; padding: 10px;">
                <tbody>
                    <%
                        String id=(String)session.getAttribute("StaffID");
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from staffreg where StaffID='"+id+"'");
                    while(rs.next())
                    {
                        
                    
                    %>
     <tr><td style="border-radius: 5px;font-size: 20px; color: greenyellow">Username</td><td style="border-radius: 5px;font-size: 20px;"><%=rs.getString(1)%></td></tr>
     <tr><td style="border-radius: 5px;font-size: 20px; color: greenyellow">StaffID</td><td style="border-radius: 5px;font-size: 20px;"><%=rs.getString(2)%></td></tr>
     <tr><td style="border-radius: 5px;font-size: 20px; color: greenyellow">Email</td><td style="border-radius: 5px;font-size: 20px;"><%=rs.getString(3)%></td></tr>
     <tr><td style="border-radius: 5px;font-size: 20px; color: greenyellow">PhoneNumber</td><td style="border-radius: 5px;font-size: 20px;"><%=rs.getString(4)%></td></tr>
     <tr><td style="border-radius: 5px;font-size: 20px; color: greenyellow">DOB</td><td style="border-radius: 5px;font-size: 20px;"><%=rs.getString(5)%></td></tr>
     <tr><td style="border-radius: 5px;font-size: 20px; color: greenyellow">College</td><td style="border-radius: 5px;font-size: 20px;"><%=rs.getString(7)%></td></tr>      
               <%}
               %>
                </tbody>
            </table><p></p>
            <a style="border-radius: 5px;text-decoration: none;border: 1px solid white; color: white;padding: 4px; font-size: 17px;" href="passrename.jsp">Change Password</a>&nbsp;&nbsp;&nbsp;
            <a style="border-radius: 5px;text-decoration: none;background: transparent;border: 1px solid white;padding: 4px; color: white; font-size: 17px;" href="staffhome.jsp">Back</a>
        </center>
    </body>
</html>
