package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staffhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<title>Staff Homepage</title>\n");
      out.write("\t\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/stahome.css\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <ul class=\"main-nav\">\n");
      out.write("\t<li><a href=\"staffhome.jsp\">HOME</a></li>\n");
      out.write("        <li><a href=\"studentregister.jsp\">ADD STUDENT</a></li>\n");
      out.write("        <li><a href=\"#\">ADD TOURNAMENT</a>\n");
      out.write("            <ul>\n");
      out.write("                <div><li><a href=\"StateAddtour.jsp\">STATE LEVEL</a></li></div>\n");
      out.write("                <div><li><a href=\"CollegeAddtour.jsp\">COLLEGE LEVEL</a></li></div>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"Selection.jsp\">SELECTION</a></li>\n");
      out.write("        <li><a href=\"#\">PROFILE</a></li>\n");
      out.write("        <li><a href=\"index.jsp\">LOGOUT</a></li>\n");
      out.write("</ul>\n");
      out.write("</body>\n");
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
