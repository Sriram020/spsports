<%-- 
    Document   : loginaction
    Created on : Jul 31, 2018, 10:24:50 AM
    Author     : ECIL
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
          String id=request.getParameter("stid");
          String Password=request.getParameter("pswd");
          session.setAttribute("StaffID",id);
          
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select StaffID,Password,College from staffreg where StaffID='"+id+"'");
          if(rs.next())
          {
           String i=rs.getString(1);
           String p=rs.getString(2);
           String c=rs.getString(3);
           session.setAttribute("College",c);
           if(i.equals(id)&&p.equals(Password))
           {
             response.sendRedirect("staffhome.jsp");
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
