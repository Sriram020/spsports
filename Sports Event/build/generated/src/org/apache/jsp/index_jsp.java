package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sports Event</title>\n");
      out.write("        <link  href=\"css/mainpage.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("           <ul class=\"main-nav\">\n");
      out.write("                <li class=\"active\"><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                <li><a href=\"\">TOURNAMENT</a>\n");
      out.write("                <ul><li><a href=\"collegetourview.jsp\">COLLEGE LEVEL</a></li>\n");
      out.write("                    <li><a href=\"statetourview.jsp\">STATE LEVEL</a></li>\n");
      out.write("                </ul></li>\n");
      out.write("                <li><a href=\"selected.jsp\">SELECTED</a></li>\n");
      out.write("                    <li><a href=\"\">LOGIN</a>\n");
      out.write("                <ul><li><a href=\"adminlogin.jsp\">ADMIN</a></li>\n");
      out.write("                    <li><a href=\"stafflogin.jsp\">STAFF</a></li>\n");
      out.write("                </ul></li>\n");
      out.write("                <li><a href=\"aboutus.jsp\">ABOUT US</a></li>\n");
      out.write("           </ul>    \n");
      out.write("           \n");
      out.write("            </body>\n");
      out.write("</html>");
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
