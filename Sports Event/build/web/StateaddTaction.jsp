<%-- 
    Document   : addTaction
    Created on : Aug 13, 2018, 11:21:34 AM
    Author     : ECIL
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@include file="connection.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddTour</title>
    </head>
    <body>
      <%
        String Tourname=request.getParameter("Tname");
        String Sportname=request.getParameter("Sname");
        String Venue=request.getParameter("venue");
        String SDate=request.getParameter("start");
        String EDate=request.getParameter("end");
        
        PreparedStatement ps=con.prepareStatement("insert into statetour values(?,?,?,?,?)");
        ps.setString(1,Tourname);
        ps.setString(2,Sportname);
        ps.setString(3,Venue);
        ps.setString(4,SDate);
        ps.setString(5,EDate);
        
        ps.executeUpdate();
        
        out.println("Added Successfully");
      %>  
    </body>
</html>
