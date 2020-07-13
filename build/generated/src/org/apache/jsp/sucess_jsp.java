package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class sucess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body><center>\n");
      out.write("    <form action=\"Userj\" method=\"get\">\n");
      out.write("    <h1>Login success</h1>\n");
      out.write("    <h1>CLICK HERE TO CONTINUE</h1>\n");
      out.write("    <h1>select the Examination</h1><br/><br/>\n");
      out.write("   <select id=\"sem\" name=\"sem\">\n");
      out.write("  <option value=\"Semester 1\">Semester 1</option>\n");
      out.write("  <option value=\"Semester 2\">Semester 2</option>\n");
      out.write("  <option value=\"Semester 3\">Semester 3</option>\n");
      out.write("  <option value=\"Semester 4\">Semester 4</option>\n");
      out.write("  <option value=\"Semester 5\">Semester 5</option>\n");
      out.write("  <option value=\"Semester 6\">Semester 6</option>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("   </select>\n");
      out.write("  <br/><br/>\n");
      out.write("  ");

      Connection con=null;
      Statement statement = null;
      PreparedStatement ps=null;
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
          statement=con.createStatement();
          String name=(String)session.getAttribute("name");
          String sql="SELECT * from Teacher where name=?";
          
          ps=con.prepareStatement(sql);
          ps.setString(1, name);
          ResultSet rs=ps.executeQuery();
          
      out.write("\n");
      out.write("          <p>Select Subject:\n");
      out.write("              <select id=\"sub\" name=\"sub\">\n");
      out.write("                  ");

                      while(rs.next())
                      {
                          String subject=rs.getString("subject");
                          
      out.write("\n");
      out.write("                          <option value=\"");
      out.print(subject );
      out.write('"');
      out.write('>');
      out.print(subject );
      out.write("</option>\n");
      out.write("                          ");

                              }
                              
      out.write("\n");
      out.write("              </select>\n");
      out.write("          </p>\n");
      out.write("          ");

              }
catch(SQLException e)
{
out.println(e);
}

      out.write("\n");
      out.write("      \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <br/>\n");
      out.write("    <br/><br/>\n");
      out.write("        <h1>select the Examination</h1><br/><br/>\n");
      out.write("   <select id=\"type\" name=\"type\">\n");
      out.write("  <option value=\"Test 1\">Theory1</option>\n");
      out.write("  <option value=\"Test 2\">Theory2</option>\n");
      out.write("  <option value=\"Test 3\">Theory3</option>\n");
      out.write(" <!-- <option value=\"Quiz 1\">Quiz1</option>\n");
      out.write("  <option value=\"Quiz 2\">Quiz2</option>-->\n");
      out.write("   </select>\n");
      out.write("  <br/><br/><br/>\n");
      out.write(" <!--<h1>select the Subject</h1><br/><br/>\n");
      out.write("  <select id=\"subject\" name=\"subject\">\n");
      out.write("  <option value=\"EAP\">EAP</option>\n");
      out.write("  <option value=\"STP\">STP</option>\n");
      out.write("  <option value=\"JAVA\">JAVA</option>\n");
      out.write("  \n");
      out.write("</select>--><br/><br/>\n");
      out.write("<!--<center>\n");
      out.write("  Time<input type=\"text\" name=\"time\"><br/><br/>\n");
      out.write("  Max Marks<input type=\"text\" name=\"maxmarks\"><br/><br/>\n");
      out.write("</center>-->\n");
      out.write("\n");
      out.write("    <input type=\"submit\" value=\"SUBMIT\">\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</body>\n");
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
