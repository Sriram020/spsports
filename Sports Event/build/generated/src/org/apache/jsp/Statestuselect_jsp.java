package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.*;
import java.io.*;

public final class Statestuselect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/connection.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body><h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 Class.forName("com.mysql.jdbc.Driver");
             
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sports","root","sriram123$");
        

      out.write("\n");
      out.write("    </h1>    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Selection Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Statestuselect.jsp\">\n");
      out.write("            Rollnumber<input type=\"text\" value=\"\" name=\"roll\" placeholder=\"Rollnumber\">\n");
      out.write("            Status<select name=\"status\">\n");
      out.write("                <option>Selected for State</option>\n");
      out.write("                <option>Rejected</option>\n");
      out.write("            </select>\n");
      out.write("            <button type=\"submit\" value=\"submit\">Update</button>\n");
      out.write("            ");

            String Roll=request.getParameter("roll");
            String Status=request.getParameter("status");
            PreparedStatement ps=con.prepareStatement("update stureg set Status=? where Roll_number='"+Roll+"'");
            ps.setString(1,Status);
            int k=ps.executeUpdate();
          if(k!=0){
              out.println("Updated Successfully");
          }
          else{
              out.println("Invalid Entry");
          }
                    
            
      out.write("\n");
      out.write("        </form>\n");
      out.write("            <form action=\"Statestuselect.jsp\"><select name=\"Sport\">\n");
      out.write("                <option>Cricket</option>\n");
      out.write("                <option>Football</option>\n");
      out.write("                <option>Volleyball</option>\n");
      out.write("                <option>Badminton</option>\n");
      out.write("                <option>Running</option>\n");
      out.write("                <option>Kabbadi</option>\n");
      out.write("            </select>\n");
      out.write("            <button type=\"submit\" value=\"submit\">OK</button></form>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Student Name</td>\n");
      out.write("                    <td>Roll Number</td>\n");
      out.write("                    <td>Phone Number</td>\n");
      out.write("                    <td>DOB</td>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td>Sport</td>\n");
      out.write("                    <td>Status</td>\n");
      out.write("                </tr>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        String sport=request.getParameter("Sport");
                    
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select Student_Name,Roll_Number,Phone_Number,DOB,Email,Sport,Status from stureg where Sport='"+sport+"'");
                    while(rs.next())
                    {
                        
                    
                    
      out.write("\n");
      out.write("     <tr>\n");
      out.write("         <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("              </tr>      \n");
      out.write("               ");
}
               
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
