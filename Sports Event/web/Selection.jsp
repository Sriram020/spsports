<%-- 
    Document   : Statestuselect
    Created on : Aug 18, 2018, 1:15:16 PM
    Author     : ECIL
--%>
<%@page import="java.sql.PreparedStatement"%>
<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Selection Page</title><style>
            #selection
            {
                display: none;
            }
        </style>
    </head>
    <body style="background-image: url(css/img2.jpg);">
        <center>
            <button style="color: lightblue;padding: 20px; font-size: 40px;border: none; background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)) transparent;" id="student">Students</button>&nbsp;<button style="color: lightblue;padding: 20px; font-size: 40px;border: none; background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)) transparent;" id="select">Selection</button>
            <div id="students"> <h1 style="color: lightblue; background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)) transparent;">Students</h1>
            <form action="Selection.jsp"><table style="color: lightblue; background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)) transparent;padding:50px;border-radius: 10px; font-size: 20px;"><tr><td><b>Sport Name</b></td>
                        <td><select style="background: transparent;color: lightblue;border-radius: 5px; font-size: 20px; width: 100px" name="Sport">
                <option>Cricket</option>
                <option>Football</option>
                <option>Volleyball</option>
                <option>Badminton</option>
                <option>Running</option>
                <option>Kabbadi</option>
                            </select></td>
                    <tr><td><b>Level</b></td><td><select style="background: transparent;color: lightblue;border-radius: 5px; font-size: 20px; width: 100px" name="level">
                <option>College</option>
                <option>State</option>
            </select></td>
                    <tr><td></td><td><button style="background: transparent;color: lightblue;border-radius: 5px; font-size: 20px; width: 80px;" type="submit" value="submit">OK</button></td></table></form>
                    <p></p>
                    <p></p>
                    <p></p>
            <table border="2" style="color: lightblue; background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)) transparent;padding:0px;border-radius: 10px; font-size: 20px;">
                <tr>
                    <td>Student Name</td>
                    <td>Roll Number</td>
                    <td>Phone Number</td>
                    <td>DOB</td>
                    <td>Email</td>
                    <td>Sport</td>
                    <td>Status</td>
                    <td>Level</td>
                </tr>
                <tbody>
                    <%
                        String c1=(String)session.getAttribute("College");
                        String sport=request.getParameter("Sport");
                        String Level=request.getParameter("level");
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select Student_Name,Roll_Number,Phone_Number,DOB,Email,Sport,Status,Level from stureg where Sport='"+sport+"' and College='"+c1+"' and Level='"+Level+"'");
                    while(rs.next())
                    {
                        
                    
                    %>
     <tr>
         <td><%=rs.getString(1)%></td>
         <td><%=rs.getString(2)%></td>
         <td><%=rs.getString(3)%></td>
         <td><%=rs.getString(4)%></td>
         <td><%=rs.getString(5)%></td>
         <td><%=rs.getString(6)%></td>
         <td><%=rs.getString(7)%></td>
         <td><%=rs.getString(8)%></td>  
     </tr>      
               <%}
               %>
                </tbody>
            </table></div>
                
                
                <div id="selection">
                    <h1 style="color: lightblue; background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)) transparent;">Selection</h1><form action="Selection.jsp">
                
                        <table border="2" style="color: lightblue; background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)) transparent;padding:0px;border-radius: 10px; font-size: 20px;">
                    <tr><td><b>Roll Number</b></td>
                        <td><input style="background: transparent;color: lightblue;border-radius: 5px;font-size: 20px;" type="text" value="" name="roll"><td></tr>
            <tr><td><b>Status</b></td><td><select style="background:  transparent;color: lightblue;border-radius: 5px; font-size: 20px; width: 100px" name="status">
                <option>Selected</option>
                <option>Rejected</option>
            </select></td></tr>
            <tr><td></td><td><button style="background:  transparent;color: lightblue;border-radius: 5px;font-size: 20px; width: 80px;" type="submit" value="submit">Update</button></td></tr></table>
        <u><b style="font-size: 20px;color: red;text-decoration: none">
            <%
            String id=(String)session.getAttribute("StaffID");
            String c=(String)session.getAttribute("College");
            String Roll=request.getParameter("roll");
            String Status=request.getParameter("status");
            Statement st1=con.createStatement();
          ResultSet rs1=st1.executeQuery("select College from stureg where Roll_Number='"+Roll+"'");
            if(rs1.next())
            {
              String clg=rs1.getString(1);
              if(clg.equals(c))
              {
                PreparedStatement ps=con.prepareStatement("update stureg set Status=? where Roll_number='"+Roll+"'");
            ps.setString(1,Status);
            int k=ps.executeUpdate();
          if(k!=0){
              %>
              <b style="color: green">Updated Successfully</b>
          <%
          }
          else{
              out.println("Invalid Entry");
          }
              }
            
           
          else{
              out.println("Can't Select Other College Students");
          }
            }
            else
                {
                 out.println("Invalid Entry");
                }
                    
            %>
       </b> </u>  </form></div>
        <p></p><a style="color: lightblue;text-decoration: none;background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)) transparent;border: 1px solid black;padding: 4px;font-size: 17px;" href="staffhome.jsp">Back</a>
        </center>
<script language="javascript">
                    
                        document.getElementById("student").onclick=function(){
                        document.getElementById("students").style.display="block";
                        document.getElementById("selection").style.display="none";
               };
                 document.getElementById("select").onclick=function(){
                        document.getElementById("selection").style.display="block";
                        document.getElementById("students").style.display="none";
               };       
                    
    
                    
                </script></body>
</html>
