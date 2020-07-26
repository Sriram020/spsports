<%-- 
    Document   : delete
    Created on : Jul 26, 2018, 10:32:07 AM
    Author     : ECIL
--%>
<%@include file="connection.jsp" %>
<%@include file="adminhome.jsp" %>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
        
    </head>
    <body>
        <div id="del">
        <form action="deletestaff.jsp">
            <p>Staff Mobile<input type="text" name="mob"></p>
            <input type="submit" value="submit">
            </form>
        <%
            String Mobile=request.getParameter("mob");
            Statement st=con.createStatement();
            int s=st.executeUpdate("delete from staffreg where Mobile='"+Mobile+"'");
            if(s!=0)
            {
            out.println("DELETED SUCCESSFULLY");
            out.println("Please wait for a while......");
            response.setHeader("Refresh","5;adminhome.jsp");
            }
            else
            {
                out.println("Invalid Mobiile Number");
            }
        %>  
    </div> </body>
</html>
