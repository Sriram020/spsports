<%-- 
    Document   : staffhome
    Created on : 13 Aug, 2018, 7:26:08 PM
    Author     : Sriramkumar
--%>

<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<title>Staff Homepage</title>
		
	<link rel="stylesheet" href="css/stahome.css" type="text/css" />

	
</head>
<body>
    <ul class="main-nav">
	<li><a href="staffhome.jsp">HOME</a></li>
        <li><a href="studentregister.jsp">ADD STUDENT</a></li>
        <li><a href="Selection.jsp">SELECTION</a></li>
        <li><a href="staffpro.jsp">PROFILE</a></li>
        <li><a href="index.jsp">LOGOUT</a></li>
</ul>
    <%
       String id=(String)session.getAttribute("StaffID");
       String c=(String)session.getAttribute("College");
    %>
</body>
</html>
