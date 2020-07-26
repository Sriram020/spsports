package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staffregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Staff Register</title>\n");
      out.write("        <link href=\"css/staffreg.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body> <div class=\"reg\"><form action=\"regaction.jsp\">\n");
      out.write("                    <h2>Staff Registration</h2>\n");
      out.write("        <div class=\"inputbox\"><input type=\"text\" value=\"\" name=\"name\" required><label>Staff Name</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"text\" value=\"\" name=\"staffid\" required><label>StaffID</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"email\" value=\"\" name=\"email\" required><label>Email</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"text\" value=\"\" name=\"mob\" required><label>Mobile</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"text\" value=\"\" name=\"clg\" required><label>College Name</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"date\" value=\"\" name=\"DOB\" required></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"password\" value=\"\" name=\"pswd\" onkeyup=\"check();\" required><label>Password</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"password\" value=\"\" name=\"rpswd\" onkeyup=\"check();\" required><label>ReenterPassword</label></div>\n");
      out.write("        <input type=\"submit\" value=\"Register\">      \n");
      out.write("        </form><form action=\"adminhome.jsp\"><p><input type=\"submit\" value=\"Back\" ></p></form></div>\n");
      out.write("        <span id=\"message\"></span> \n");
      out.write("    \n");
      out.write("        <script>\n");
      out.write("            var check=function()\n");
      out.write("            {\n");
      out.write("                if(documnet.getElementByName(\"pswd\").value==documnet.getElementByName(\"rpswd\").value)\n");
      out.write("                {\n");
      out.write("                    documnet.getElementById(\"message\").style.color=\"green\";\n");
      out.write("                    documnet.getElementById(\"message\").innerHTML=\"matching\";\n");
      out.write("                    return=\"true\";\n");
      out.write("                }\n");
      out.write("                else;\n");
      out.write("                {\n");
      out.write("                    documnet.getElementById(\"message\").style.color=\"red\";\n");
      out.write("                    documnet.getElementById(\"message\").innerHTML=\"not matching\";\n");
      out.write("                    return=\"false\";\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("        </script>\n");
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
