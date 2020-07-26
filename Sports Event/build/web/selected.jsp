<%-- 
    Document   : selected
    Created on : 10 Sep, 2018, 2:16:56 PM
    Author     : Sriramkumar
--%>
<%@include file="connection.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Selected</title>
    </head>
    <body style="background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)),url(worldcup.jpeg);height: 95vh;background-size: cover;">
        <center><h1 style="background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5));color: white;text-align: center;">Selected Candidates</h1>
        <form action="selected.jsp">
            <table border="2" style="color: white;font-size: 20px; background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)) transparent;padding:0px;border-radius: 10px; font-size: 20px;">
                <tr><td>College Name</td><td><input  style="background: transparent;color: white;border-radius: 5px;font-size: 20px;" type="text" value="" name="college" required></td></tr>
        <tr><td>Sport Name</td><td><select style="background:  transparent;color: white;border-radius: 5px; font-size: 20px; width: 100px" name="sport">
            <option>Cricket</option>
            <option>Football</option>
            <option>Volleyball</option>
            <option>Badminton</option>
            <option>Running</option>
            <option>Kabbadi</option>
        </select></td></tr>
        <tr><td>Level</td><td><select style="background:  transparent;color: white;border-radius: 5px; font-size: 20px; width: 100px" name="level">
            <option>College</option>
            <option>State</option>
        </select></td></tr>
        <tr><td></td><td><button style="background:  transparent;color: white;border-radius: 5px;font-size: 20px; width: 80px;" type="submit" name="OK">OK</button></td></tr>
        </table></form><p></p><p></p>
        <table border="2" style="color: white; background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)) transparent;padding:0px;border-radius: 10px; font-size: 20px;">
            <tr>
                <td>Student Name</td>
                <td>Roll Number</td>
                <td>College</td>
                <td>Sport</td>
                <td>Status</td>
                <td>Level</td>
           </tr>
           <tbody>
               <%
                  String Sport=request.getParameter("sport");
                  String College=request.getParameter("college");
                  String Level=request.getParameter("level");
                  
                  Statement st=con.createStatement();
                  ResultSet rs=st.executeQuery("Select * from stureg where Sport='"+Sport+"' and College='"+College+"' and Level='"+Level+"' and Status='Selected'");
                  while(rs.next())
                  {
                  %>
                  <tr>
         <td><%=rs.getString(1)%></td>
         <td><%=rs.getString(2)%></td>
         <td><%=rs.getString(6)%></td>
         <td><%=rs.getString(7)%></td>
         <td><%=rs.getString(8)%></td>
         <td><%=rs.getString(9)%></td>
     </tr>  
                  <% }
                  %>
               
           </tbody>
        </table>
        <p></p><a style="color: white;border-radius: 10px;text-decoration: none;background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)) transparent;border: 1px solid black;padding: 4px;font-size: 17px;" href="index.jsp">Back</a></center>
    </body>
</html>
