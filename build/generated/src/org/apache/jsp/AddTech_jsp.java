package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddTech_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("           <head>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"/login.css\"/>\n");
      out.write("        <style>\n");
      out.write("            .form{\n");
      out.write("               \n");
      out.write("   position: relative;\n");
      out.write("  z-index: 1;\n");
      out.write("  background: #489ac975;\n");
      out.write("  max-width: 360px;\n");
      out.write("  margin: 0 auto 100px;\n");
      out.write("  padding: 45px;\n");
      out.write("  text-align: center;\n");
      out.write("  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);\n");
      out.write("            }\n");
      out.write("       \n");
      out.write(".form input,select {\n");
      out.write("  font-family: FontAwesome, \"Roboto\", sans-serif;\n");
      out.write("  outline: 0;\n");
      out.write("  background: #f2f2f2;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 0;\n");
      out.write("  margin: 0 0 15px;\n");
      out.write("  padding: 15px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-size: 14px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".form button {\n");
      out.write("  font-family: \"Titillium Web\", sans-serif;\n");
      out.write("  font-size: 14px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  letter-spacing: .1em;\n");
      out.write("  outline: 0;\n");
      out.write("  background-color: #1784a5;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 0;\n");
      out.write("  margin: 0px 0px 8px;\n");
      out.write("  padding: 15px;\n");
      out.write("  color: #FFFFFF;\n");
      out.write("  -webkit-transition: all 0.3 ease;\n");
      out.write("  transition: all 0.3 ease;\n");
      out.write("  cursor: pointer;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write(".form button:hover,.form button:active,.form button:focus {\n");
      out.write("  background-color: #148f77;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".form .message {\n");
      out.write("  \n");
      out.write("  margin: 6px 6px;\n");
      out.write("  color: #808080;\n");
      out.write("  font-size: 11px;\n");
      out.write("  text-align: center;\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-style: normal;\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("}\n");
      out.write(".form .message a {\n");
      out.write("  color: #FFFFFF;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 13px;\n");
      out.write("}\n");
      out.write(".form .register-form {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write(".container {\n");
      out.write("  position: relative;\n");
      out.write("  z-index: 1;\n");
      out.write("  max-width: 300px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("}\n");
      out.write(".container:before, .container:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: block;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write(".container .info {\n");
      out.write("  margin: 50px auto;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".container .info h1 {\n");
      out.write("  margin: 0 0 15px;\n");
      out.write("  padding: 0;\n");
      out.write("  font-size: 36px;\n");
      out.write("  font-weight: 300;\n");
      out.write("  color: #1a1a1a;\n");
      out.write("}\n");
      out.write(".container .info span {\n");
      out.write("  color: #4d4d4d;\n");
      out.write("  font-size: 12px;\n");
      out.write("}\n");
      out.write(".container .info span a {\n");
      out.write("  color: #000000;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".container .info span .fa {\n");
      out.write("  color: #EF3B3A;\n");
      out.write("}\n");
      out.write(".animate {\n");
      out.write("  -webkit-animation-duration: 1s;\n");
      out.write("  animation-duration: 1s;\n");
      out.write("  -webkit-animation-fill-mode: both;\n");
      out.write("  animation-fill-mode: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-color: #f1f1f1; /* fallback for old browsers */\n");
      out.write("  background: -webkit-linear-gradient(right, #76b852, #8DC26F);\n");
      out.write("  background: -moz-linear-gradient(right, #76b852, #8DC26F);\n");
      out.write("  background: -o-linear-gradient(right, #76b852, #8DC26F);\n");
      out.write("  background: linear-gradient(to left, #76b852, #8DC26F);\n");
      out.write(" \n");
      out.write("  -webkit-font-smoothing: antialiased;\n");
      out.write("  -moz-osx-font-smoothing: grayscale;    \n");
      out.write("font-family: 'Montserrat', sans-serif;\n");
      out.write("\t\n");
      out.write("\tfont-weight: 400;  \n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"login-page\">\n");
      out.write("<center>\n");
      out.write("    <div id=\"animate\">\n");
      out.write("<form method=\"post\" action=\"AddTech1.jsp\" class=\"form\">\n");
      out.write("    <h1>ADD THE TEACHERS</h1><br/><br/>\n");
      out.write("    username:<br>\n");
      out.write("<input type=\"text\" name=\"username\">\n");
      out.write("<br>\n");
      out.write("password:<br>\n");
      out.write("<input type=\"password\" name=\"password\">\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<input type=\"submit\" value=\"submit\">\n");
      out.write("</form>\n");
      out.write("    </div>\n");
      out.write("</center>\n");
      out.write("    </div>\n");
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
