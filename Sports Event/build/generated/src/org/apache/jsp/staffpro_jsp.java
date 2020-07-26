package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class staffpro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Profile</title>\n");
      out.write("        <link href=\"css/staffpro.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\">\n");
      out.write("        <center>\n");
      out.write("            <table border=\"1\" bordercolor=\"white\" style=\"border-radius: 10px;margin-top: 200px; color: white; padding: 10px;\">\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        String id=(String)session.getAttribute("StaffID");
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from staffreg where StaffID='"+id+"'");
                    while(rs.next())
                    {
                        
                    
                    
      out.write("\n");
      out.write("     <tr><td style=\"border-radius: 5px;font-size: 20px; color: greenyellow\">Username</td><td style=\"border-radius: 5px;font-size: 20px;\">");
      out.print(rs.getString(1));
      out.write("</td></tr>\n");
      out.write("     <tr><td style=\"border-radius: 5px;font-size: 20px; color: greenyellow\">StaffID</td><td style=\"border-radius: 5px;font-size: 20px;\">");
      out.print(rs.getString(2));
      out.write("</td></tr>\n");
      out.write("     <tr><td style=\"border-radius: 5px;font-size: 20px; color: greenyellow\">Email</td><td style=\"border-radius: 5px;font-size: 20px;\">");
      out.print(rs.getString(3));
      out.write("</td></tr>\n");
      out.write("     <tr><td style=\"border-radius: 5px;font-size: 20px; color: greenyellow\">PhoneNumber</td><td style=\"border-radius: 5px;font-size: 20px;\">");
      out.print(rs.getString(4));
      out.write("</td></tr>\n");
      out.write("     <tr><td style=\"border-radius: 5px;font-size: 20px; color: greenyellow\">DOB</td><td style=\"border-radius: 5px;font-size: 20px;\">");
      out.print(rs.getString(5));
      out.write("</td></tr>\n");
      out.write("     <tr><td style=\"border-radius: 5px;font-size: 20px; color: greenyellow\">College</td><td style=\"border-radius: 5px;font-size: 20px;\">");
      out.print(rs.getString(7));
      out.write("</td></tr>      \n");
      out.write("               ");
}
               
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table><p></p>\n");
      out.write("            <a style=\"text-decoration: none;border: 1px solid white; color: white;padding: 4px; font-size: 17px;\" href=\"passrename.jsp\">Change Password</a>&nbsp;&nbsp;&nbsp;\n");
      out.write("            <a style=\"text-decoration: none;background: transparent;border: 1px solid white;padding: 4px; color: white; font-size: 17px;\" href=\"staffhome.jsp\">Back</a>\n");
      out.write("        </center>\n");
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
