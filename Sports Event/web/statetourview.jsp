<%@page import="java.sql.PreparedStatement"%>
<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>State View</title>
           </head>
    
           <body style="background-image: url(css/img3.jpg);">
        <center>
            <h1 style="background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) darkturquoise; color: lightblue">State Level Tournaments</h1>
            <form action="statetourview.jsp"><select name="Sport" style="color: lightblue; width: 150px; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) darkturquoise;padding:0px;border-radius: 10px; font-size: 20px;">
                <option>Cricket</option>
                <option>Football</option>
                <option>Volleyball</option>
                <option>Badminton</option>
                <option>Running</option>
                <option>Kabbadi</option>
            </select>
            <button style="width: 80px;color: lightblue; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) darkturquoise;padding:0px;border-radius: 10px; font-size: 20px;" type="submit" value="submit">OK</button></form>
            <table  border="2" style="color: lightblue; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) darkturquoise;padding:0px;border-radius: 10px; font-size: 20px;">
                <tr>
                    <td>Tournament Name</td>
                    <td>Sport Name</td>
                    <td>Venue</td>
                    <td>Start Date</td>
                    <td>End Date</td>       
                </tr>
                <tbody>
                    <%
                        String sport=request.getParameter("Sport");
                    
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from statetour where Sport='"+sport+"'");
                    while(rs.next())
                    {
                        
                    
                    %>
     <tr>
         <td><%=rs.getString(1)%></td>
         <td><%=rs.getString(2)%></td>
         <td><%=rs.getString(3)%></td>
         <td><%=rs.getString(4)%></td>
         <td><%=rs.getString(5)%></td>
         
     </tr>      
               <%}
               %>
                </tbody>
            </table>
                <form action="index.jsp"><p><button style="width: 160px; color: lightblue; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) darkturquoise;padding:0px;border-radius: 10px; font-size: 20px;" type="submit" value="submit" >Back To Home</button></p></form>
        </center>
    </body>
</html>
