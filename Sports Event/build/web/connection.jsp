<%-- 
    Document   : connection
    Created on : Jul 23, 2018, 9:36:12 AM
    Author     : ECIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body><h1>
        <%@page import="java.sql.*" %>
        <%@page import="java.io.*" %>
        <%! Connection con;%>
        
        <% Class.forName("com.mysql.jdbc.Driver");
             
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sports","root","root");
        
%>
    </h1>    </body>
</html>
