<%-- 
    Document   : regaction1
    Created on : 4 Aug, 2018, 10:16:56 AM
    Author     : srira_000
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Regaction</title>
    </head>
    <body>
        <%
        String c=(String)session.getAttribute("College");
        String Name=request.getParameter("name");
        String RollNo=request.getParameter("roll");
        String Email=request.getParameter("email");
        String Mobile=request.getParameter("mob");
        String DOB=request.getParameter("DOB");
        String Sport=request.getParameter("sport");
        String Status=request.getParameter("status");
        String Level=request.getParameter("level");
           
       PreparedStatement ps=con.prepareStatement("insert into stureg values(?,?,?,?,?,?,?,?,?)");
       ps.setString(1,Name);
       ps.setString(2,RollNo);
       ps.setString(3,Email);
       ps.setString(4,Mobile);
       ps.setString(5,DOB);
       ps.setString(6,Sport);
       ps.setString(7,c);
       ps.setString(8,Status);
       ps.setString(9,Level);
       
       
       ps.executeUpdate();
        
      
       
            out.println("inserted succesfully");
        %>
        <a href="staffhome.jsp">Go To Home</a>
    </body>
</html>

