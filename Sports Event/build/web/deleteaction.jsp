<%-- 
    Document   : deleteaction
    Created on : Jul 26, 2018, 10:40:44 AM
    Author     : ECIL
--%>
<%@include file="connection.jsp" %>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>delete action</title>
    </head>
    <body>
        <%
            String Mobile=request.getParameter("mob");
            Statement st=con.createStatement();
            st.executeUpdate("delete from staffreg where Mobile='"+Mobile+"'");
            out.println("DELETED SUCCESSFULLY");
            out.println("Please wait for a while......");
            response.setHeader("Refresh","5;adminhome.jsp");
         %>           
         </body>
</html>
