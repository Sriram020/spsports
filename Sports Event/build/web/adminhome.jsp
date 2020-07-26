<%-- 
    Document   : adminhome
    Created on : 20 Aug, 2018, 5:21:56 PM
    Author     : Sriramkumar
--%>
<%@include file="connection.jsp" %>
<%@page import="java.sql.Statement"%>
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<title>Admin Homepage</title>
		
	<link rel="stylesheet" href="css/adminhome.css" type="text/css" />
</head>
<body>
    
    <ul class="main-nav">
	<li><a href="adminhome.jsp">HOME</a></li>
        <li><a href="staffregister.jsp">ADD STAFF</a></li>
        <li><a href="staffupd.jsp">UPDATE STAFF</a></li>
        <li><a id="delete">DELETE STAFF</a>
            <ul>
                <li>
                    <div class="del" style="top: 50%;left: 50%;padding: 20px;background: rgba(0,0,0,0.1);box-sizing: border-box;box-shadow: 0 15px 25px rgba(0,0,0,0.8);border-radius: 10px;text-align: center;">
        <form action="adminhome.jsp">
            <p><label style="letter-spacing: 2px;padding: 10px 0;font-size: 16px;color: #00cccc;pointer-events: none;
    transition: 0.5s;">Staff Mobile</label><input style=" position: relative;width: 100%;padding: 10px 0;font-size: 16px;color: #00cccc;letter-spacing: 2px;margin-bottom: 30px;border: none;border-bottom: 1px solid;outline: none;background: transparent;" type="number" name="mob">
                </p>
            <input style=" position: relative;background: transparent;
    border: none;
    outline: none;
    letter-spacing: 1px;
    color: #00cccc;
    background: #cccc00;
    padding: 10px 20px;
    cursor: pointer;
    border-radius: 5px;" type="submit" value="Delete">
            </form>
        <%
            String Mobile=request.getParameter("mob");
            Statement st=con.createStatement();
            int s=st.executeUpdate("delete from staffreg where Mobile='"+Mobile+"'");
            if(s!=0)
            {
            out.println("DELETED SUCCESSFULLY");
            
            }
            else
            {
                out.println("Invalid Mobiile Number");
            }
        %>  
    </div>
            </li></ul></li>
        <li><a href="#">ADD TOURNAMENT</a>
            <ul>
                <div><li><a href="StateAddtour.jsp">STATE LEVEL</a></li></div>
                <div><li><a href="CollegeAddtour.jsp">COLLEGE LEVEL</a></li></div>
            </ul>
        </li>
        <li><a href="index.jsp">LOGOUT</a></li>
</ul>
    
    
</body>
</html>

