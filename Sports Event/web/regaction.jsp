<%-- 
    Document   : regaction1
    Created on : Aug 15, 2015, 2:46:26 AM
    Author     : CSE
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
        <p>
        <%
        String Name=request.getParameter("name");
        String id=request.getParameter("staffid");
        String Email=request.getParameter("email");
        String Mobile=request.getParameter("mob");
        String College=request.getParameter("clg");
        String DOB=request.getParameter("DOB");
        String Password=request.getParameter("pswd");
            
       PreparedStatement ps=con.prepareStatement("insert into staffreg values(?,?,?,?,?,?,?)");
       ps.setString(1,Name);
       ps.setString(2,id);
       ps.setString(3,Email);
       ps.setString(4,Mobile);
       ps.setString(5,DOB);
       ps.setString(6,Password);
       ps.setString(7,College);
       
       ps.executeUpdate();
        
      
       
            out.println("Registered succesfully");
            %>
            </p>
            <%
                out.println("Please wait for a while......");
            response.setHeader("Refresh","5;adminhome.jsp");
        %>
        
    </body>
</html>
