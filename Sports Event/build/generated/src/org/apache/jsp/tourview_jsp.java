package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.*;
import java.io.*;

public final class tourview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tournaments</title>\n");
      out.write("        <style>\n");
      out.write("            #college_button\n");
      out.write("            {\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: lightblue;\n");
      out.write("                background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) grey;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("            #state_button\n");
      out.write("            {\n");
      out.write("                font-size: 20px;\n");
      out.write("                background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) darkturquoise;\n");
      out.write("                color: lightblue;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("            #state\n");
      out.write("            {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        </head>\n");
      out.write("    \n");
      out.write("        <body style=\"background: url(css/WelcomeScan.jpg); background-size: cover;\">\n");
      out.write("        <center><button id=\"college_button\">College Level</button>&nbsp;<button id=\"state_button\">State Level</button>\n");
      out.write("            <div id=\"college\">\n");
      out.write("            <h1 style=\"color: lightblue; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) grey; \">College Level Tournaments</h1>\n");
      out.write("            <form action=\"tourview.jsp\"><select style=\"width: 150px;color: lightblue; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) grey;padding:0px;border-radius: 10px; font-size: 20px;\" name=\"Sport\">\n");
      out.write("                <option>Cricket</option>\n");
      out.write("                <option>Football</option>\n");
      out.write("                <option>Volleyball</option>\n");
      out.write("                <option>Badminton</option>\n");
      out.write("                <option>Running</option>\n");
      out.write("                <option>Kabbadi</option>\n");
      out.write("            </select>\n");
      out.write("            <button style=\"width: 80px;color: lightblue; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) grey;padding:0px;border-radius: 10px; font-size: 20px;\" type=\"submit\" value=\"submit\">OK</button></form>\n");
      out.write("            <table  border=\"2\" style=\"color: lightblue; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) grey;padding:0px;border-radius: 10px; font-size: 20px;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tournament Name</td>\n");
      out.write("                    <td>Sport Name</td>\n");
      out.write("                    <td>College Name</td>\n");
      out.write("                    <td>Start Date</td>\n");
      out.write("                    <td>End Date</td>       \n");
      out.write("                </tr>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        String sport=request.getParameter("Sport");
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from collegetour where Sport='"+sport+"'");
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
      out.write("         \n");
      out.write("     </tr>      \n");
      out.write("               ");
}
               
      out.write("\n");
      out.write("                         \n");
      out.write("                </tbody></table>\n");
      out.write("               <p><form action=\"index.jsp\"><button style=\"width: 160px;color: lightblue; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) grey;padding:0px;border-radius: 10px; font-size: 20px;\" type=\"submit\" value=\"submit\" >Back To Home</button></form></p>\n");
      out.write("            </div>\n");
      out.write("       \n");
      out.write("             <div id=\"state\">  \n");
      out.write("            <h1 style=\"background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) darkturquoise; color: lightblue\">State Level Tournaments</h1>\n");
      out.write("            <form action=\"tourview.jsp\"><select name=\"Sport1\" style=\"color: lightblue; width: 150px; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) darkturquoise;padding:0px;border-radius: 10px; font-size: 20px;\">\n");
      out.write("                <option>Cricket</option>\n");
      out.write("                <option>Football</option>\n");
      out.write("                <option>Volleyball</option>\n");
      out.write("                <option>Badminton</option>\n");
      out.write("                <option>Running</option>\n");
      out.write("                <option>Kabbadi</option>\n");
      out.write("            </select>\n");
      out.write("            <button style=\"width: 80px;color: lightblue; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) darkturquoise;padding:0px;border-radius: 10px; font-size: 20px;\" type=\"submit\" value=\"submit\">OK</button></form>\n");
      out.write("            <table  border=\"2\" style=\"color: lightblue; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) darkturquoise;padding:0px;border-radius: 10px; font-size: 20px;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tournament Name</td>\n");
      out.write("                    <td>Sport Name</td>\n");
      out.write("                    <td>Venue</td>\n");
      out.write("                    <td>Start Date</td>\n");
      out.write("                    <td>End Date</td>       \n");
      out.write("                </tr>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        String sport1=request.getParameter("Sport1");
                    
                    Statement st1=con.createStatement();
                    ResultSet rs1=st1.executeQuery("select * from statetour where Sport='"+sport1+"'");
                    while(rs1.next())
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
      out.write("         \n");
      out.write("     </tr>      \n");
      out.write("               ");
}
               
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("                <form action=\"index.jsp\"><p><button style=\"width: 160px; color: lightblue; background: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)) darkturquoise;padding:0px;border-radius: 10px; font-size: 20px;\" type=\"submit\" value=\"submit\" >Back To Home</button></p></form>\n");
      out.write("        </div></center>\n");
      out.write("                <script language=\"javascript\">\n");
      out.write("                    \n");
      out.write("                        document.getElementById(state_button).onclick function(){\n");
      out.write("                        document.getElementById(state).style.display=\"block\";\n");
      out.write("               };\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("    \n");
      out.write("                    \n");
      out.write("                </script>\n");
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
