package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Registration</title>\n");
      out.write("        <link href=\"css/stureg.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body><div class=\"registerbox\"><form action=\"regaction1.jsp\">\n");
      out.write("                    <h2>Student Registration</h2>\n");
      out.write("        <div class=\"inputbox\"><input type=\"text\" value=\"\" name=\"name\" required><label>Student Name</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"text\" value=\"\" name=\"roll\" required><label>Roll Number</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"email\" value=\"\" name=\"email\" required><label>Email</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"number\" value=\"\" name=\"mob\" required><label>Mobile</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"date\" value=\"\" name=\"DOB\" required></div>\n");
      out.write("        <div class=\"drop\"><select name=\"sport\">\n");
      out.write("                <option>Cricket</option>\n");
      out.write("                <option>Football</option>\n");
      out.write("                <option>Volleyball</option>\n");
      out.write("                <option>Badminton</option>\n");
      out.write("                <option>Running</option>\n");
      out.write("                <option>Kabbadi</option>\n");
      out.write("            </select><label>Sport</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"password\" value=\"\" name=\"pswd\" required><label>Password</label></div>\n");
      out.write("        <div class=\"inputbox\"><input type=\"password\" value=\"\" name=\"rpswd\" required><label>Re-Enter Password</label></div>\n");
      out.write("        <div class=\"drop\"><select name=\"level\">\n");
      out.write("            <option>College</option>\n");
      out.write("            <option>State</option>\n");
      out.write("        </select><label>Sport Level</label></div>\n");
      out.write("        <input type=\"submit\" name=\"\" value=\"Register\">      \n");
      out.write("        </form><form action=\"index.jsp\"><p><input type=\"submit\" value=\"Back\" ></p></form></div>\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("        function Check(form)\n");
      out.write("        {\n");
      out.write("            if (form.pswd.value===form.rpswd.value&&form.rpswd.value===form.pswd.value)\n");
      out.write("                {\n");
      out.write("                    return(true);\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                    {\n");
      out.write("                        alert(\"Error:Passwords are not matched\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("        }\n");
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
