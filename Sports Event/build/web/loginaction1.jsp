<%-- 
    Document   : loginaction1
    Created on : 4 Aug, 2018, 10:01:05 AM
    Author     : srira_000
--%>

<%@include file="connection.jsp" %>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="javax.servlet.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <%
          String Name=request.getParameter("Uname");
          String Password=request.getParameter("pswd");
          session.setAttribute("Username",Name);
          
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select Username,Password from admin where Username='"+Name+"'");
          if(rs.next())
          {
           String u=rs.getString(1);
           String p=rs.getString(2);
           if(u.equals(Name)&&p.equals(Password))
           {
             %>  
            <jsp:forward page="adminhome.jsp"/>
             <%
            }
           else{
               %>
               <jsp:forward page="error.jsp"/>
               <%
               }
            
          }
            else{
            out.println("Provide Valid Credentials");
          }
        %>
    </body>
</html>
