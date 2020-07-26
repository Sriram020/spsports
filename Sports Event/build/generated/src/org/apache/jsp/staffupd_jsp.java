package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.*;
import java.io.*;

public final class staffupd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Update</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/staffupd.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <form action=\"staffupd.jsp\">\n");
      out.write("           <div class=\"update\">\n");
      out.write("                 <h1>Update Staff</h1>\n");
      out.write("                 <div class=\"inputbox\"><p><input type=\"text\" name=\"id\" value=\"\">\n");
      out.write("                       <label>StaffID</label>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"inputbox\"><p><input type=\"text\" name=\"Uname\" value=\"\">\n");
      out.write("                       <label>Username</label>\n");
      out.write("               </div>\n");
      out.write("                 <div class=\"inputbox\"><input type=\"email\" name=\"email\" value=\"\">\n");
      out.write("                   <label>Email</label>\n");
      out.write("               </div>\n");
      out.write("                 <div class=\"inputbox\"><input type=\"number\" name=\"phno\" value=\"\">\n");
      out.write("                   <label>Phone Number</label>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"inputbox\"><input type=\"password\" name=\"pswd\" value=\"\">\n");
      out.write("                   <label>Password</label>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("               <input type=\"submit\" name=\"\"value=\"Update\">\n");
      out.write("                 \n");
      out.write("             </form> \n");
      out.write("        <form action=\"adminhome.jsp\"><input type=\"submit\" value=\"Back\"></form>\n");
      out.write("               </div>\n");
      out.write("        ");

          String Id=request.getParameter("id");
          String Name=request.getParameter("Uname");
          String Email=request.getParameter("email");
          String Number=request.getParameter("phno");
          String Password=request.getParameter("pswd");
          
          PreparedStatement ps=con.prepareStatement("update staffreg set Staffname=?,Email=?,Mobile=?,Password=? where StaffID='"+Id+"'");
          ps.setString(1,Name);
          ps.setString(2,Email);
          ps.setString(3,Number);
          ps.setString(4,Password);
          int k=ps.executeUpdate();
          if(k!=0){
              out.println("Updated Successfully");
          }
          else{
              out.println("Invalid Entry");
          }
        
      out.write("\n");
      out.write("        \n");
      out.write("    </center> </body>\n");
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
