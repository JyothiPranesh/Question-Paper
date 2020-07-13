package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class DelQues_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3307/Project";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("              \n");
      out.write("        <style>\n");
      out.write("            @import url(https://fonts.googleapis.com/css?family=Roboto:300);\n");
      out.write(".body{\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-page {\n");
      out.write("  width: 360px;\n");
      out.write("  padding: 8% 0 0;\n");
      out.write("  margin: auto;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".form {\n");
      out.write("  position: relative;\n");
      out.write("  z-index: 1;\n");
      out.write("  background: #489ac975;\n");
      out.write("  max-width: 360px;\n");
      out.write("  margin: 0 auto 100px;\n");
      out.write("  padding: 45px;\n");
      out.write("  text-align: center;\n");
      out.write("  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);\n");
      out.write("  \n");
      out.write("}\n");
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
      out.write("  font-family: \"Rose\", sans-serif;\n");
      out.write("  font-size: 14px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  letter-spacing: .1em;\n");
      out.write("  outline: 0;\n");
      out.write("  background-color: #1784a5;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 0;\n");
      out.write("  margin: 0px 0px 8px;\n");
      out.write("  padding: 15px;\n");
      out.write("  color:\"Rose\";\n");
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
      out.write("body {\n");
      out.write("  background: #76b852; /* fallback for old browsers */\n");
      out.write("  background: -webkit-linear-gradient(right, #76b852, #8DC26F);\n");
      out.write("  background: -moz-linear-gradient(right, #76b852, #8DC26F);\n");
      out.write("  background: -o-linear-gradient(right, #76b852, #8DC26F);\n");
      out.write("  background: linear-gradient(to left, #76b852, #76b852);\n");
      out.write("  font-family: \"Roboto\", sans-serif;\n");
      out.write("  -webkit-font-smoothing: antialiased;\n");
      out.write("  -moz-osx-font-smoothing: grayscale;      \n");
      out.write("}\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </style>\n");
      out.write("</head>\n");
      out.write("<body><center>\n");
      out.write("<h3>YOU CAN DELETE THE QUESTION HERE</h3>\n");
      out.write("<table border=\"1\">\n");
      out.write("<tr>\n");
      out.write("<td>Question no</td>\n");
      out.write("<td>Question</td>\n");
      out.write("<td>Marks</td>\n");
      out.write("<td>CO</td>\n");
      out.write("<td>PO</td>\n");
      out.write("</tr>\n");

try{
    String n=(String)session.getAttribute("type");
    String n1=(String)session.getAttribute("subject");
connection = DriverManager.getConnection(connectionUrl, userid, password);
statement=connection.createStatement();
String sql ="select * from Question where testno=? and sub=?";
PreparedStatement ps = connection.prepareStatement(sql);
     
    ps.setString(1, n);
    ps.setString(2, n1);
resultSet = ps.executeQuery(sql);
int i=0;
while(resultSet.next()){

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(resultSet.getString("no") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("marks") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("co") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("po") );
      out.write("</td>\n");
      out.write("<td><a href=\"DelQues1.jsp?no=");
      out.print(resultSet.getString("no") );
      out.write("\"><button type=\"button\" class=\"delete\">Delete</button></a></td>\n");
      out.write("<td><a href=\"editQues1.jsp?no=");
      out.print(resultSet.getString("no") );
      out.write("\"><button type=\"button\" class=\"edit\">edit</button></a></td>\n");
      out.write("</tr>\n");

i++;

}

      out.write("<br/><br/><a href=\"DelAll.jsp\">Delete Whole Question Paper</a><br/><br/>\n");

connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table></center>\n");
      out.write("</body>\n");
      out.write("</html> ");
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
