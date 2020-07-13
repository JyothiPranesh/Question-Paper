package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class editQues_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

try {
    String id=request.getParameter("no");
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
String query = "select * from Question where no="+id;
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery(query);
if(rs.next()){

      out.write("\n");
      out.write("<form action=\"editQues1.jsp\" method=\"get\">\n");
      out.write("\n");
      out.write("<table>    Question no:\n");
      out.write("        <tr><input type=\"text\" name=\"no\"  size=70 value=\"");
      out.print(rs.getString("no"));
      out.write("\"></tr>\n");
      out.write("<br/><br/>\n");
      out.write("Question:&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"text\" name=\"name\" size=\"70\" value=\"");
      out.print(rs.getString("name"));
      out.write("\">\n");
      out.write("<br/><br/>\n");
      out.write("Marks:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"text\" name=\"marks\" size=\"70\" value=\"");
      out.print(rs.getString("marks"));
      out.write("\"><br/><br/>\n");
      out.write("\n");
      out.write("CO:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"text\" name=\"co\" size=\"70\" value=\"");
      out.print(rs.getString("co"));
      out.write("\"><br/><br/>\n");
      out.write("PO:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"text\" name=\"po\" size=\"70\" value=\"");
      out.print(rs.getString("po"));
      out.write("\"><br/><br/>\n");
      out.write("<br/><input type=\"submit\" value=\"submit\"></form></table><br/><br/>\n");
      out.write("\n");

    String no=request.getParameter("no");
    session.setAttribute("did",no);
}
}
catch(Exception e){}

      out.write('\n');
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
