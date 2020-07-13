package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class DisQues_jsp extends org.apache.jasper.runtime.HttpJspBase
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


String driver = "com.mysql.jdbc.Driver";
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
      out.write("         \n");
      out.write("  <!--<meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("-->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                height: 297mm;\n");
      out.write("                width: 210mm;\n");
      out.write("                margin-left: auto;\n");
      out.write("      \n");
      out.write("                margin-right: auto;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        .mydiv{\n");
      out.write("        text-align:right;\n");
      out.write("        }\n");
      out.write("        .UpperTitle\n");
      out.write("    {\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 40px 0;\n");
      out.write(" \n");
      out.write("    font-weight:bold;\n");
      out.write("   \n");
      out.write("    border-radius: 10px;\n");
      out.write("    position: rela1tive;\n");
      out.write("    }\n");
      out.write(".UpperTitle img { position: absolute; left: 100px; top: 35px;  }\n");
      out.write("        @media print\n");
      out.write("        {\n");
      out.write("            #printPageButton{\n");
      out.write("                display:none;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"hell\">\n");
      out.write("    <form>\n");
      out.write("    <div class=\"UpperTitle\">\n");
      out.write("  <img src=\"C:\\Users\\dell\\Downloads\\rvce.jpg\" width=\"150\" height=\"150\"/>\n");
      out.write("<center>\n");
      out.write("    <h2 style=\"font-size:20px\">RV COLLEGE OF ENGINEERING</h2>\n");
      out.write("<h4  style=\"font-size:20px\">(Autonomous Institution Affiliated to VTU)<br/>\n");
      out.write("Department of Master of Computer Applicaton<br/>\n");
      out.write("Continous Internal Evaluation</h4>\n");

   
  String n=(String)session.getAttribute("type");  
  String n1=(String)session.getAttribute("subject");
String n3=(String)session.getAttribute("code");
String n2=(String)session.getAttribute("sem1");
String n4=(String)session.getAttribute("time");
String n5=(String)session.getAttribute("maxmarks");
String n6=(String)session.getAttribute("name");
out.println("Semester:"+n2+"<br/>");
 out.print(n+"<br/>");  
 out.print("Subject:"+n1+"("+n3+")<br/>");  
 // out.print("code:"+n3+"<br/>");

      out.write("\n");
      out.write("<hr>\n");
      out.write("</div>\n");

out.println("Faculty:"+n6);

      out.write("\n");
      out.write("<br/>\n");
      out.write("<center>");

out.println("Answer All Questions");

      out.write("</center><br/>\n");

    out.println("Time:90 Min");
      out.write("\n");
      out.write("   <div class =\"mydiv\">\n");
      out.write("   ");
 out.print("Max.Mar:"+50);

      out.write("\n");
      out.write("</div>\n");
      out.write("<br/>\n");
      out.write("<center>\n");
      out.write("<table class=\"table table-bordered\">\n");
      out.write("<!--<table border=\"1\">-->\n");
      out.write("<tr>\n");
      out.write("    <td style=\"width:2%\">Question no</td>\n");
      out.write("<td style=\"width:40%\">Question</td>\n");
      out.write("<td style=\"width:1%\">Marks</td>\n");
      out.write("<td style=\"width:1%\">CO</td>\n");
      out.write("<td style=\"width:1%\">PO</td>\n");
      out.write("\n");
      out.write("</tr>\n");

    connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
statement=connection.createStatement();
                    try
                    {
                   // Class.forName("com.mysql.jdbc.Driver");
                    //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
                   // Statement st=conn.createStatement();
                    ResultSet rs =null;
          
                   String markssum=null;
                   PreparedStatement st=null;
                   
                     String sql="select Sum(marks) as totalmarks from Question";
                   
                     st= connection.prepareStatement(sql);
                  
                         rs= st.executeQuery();
                       
                    if(rs.next())
                    { 
                    markssum =rs.getString("totalmarks");
                     }
                    session.setAttribute("marks",markssum);
                    String mar=(String)session.getAttribute("marks");
                    //out.println("marks:"+mar+"<br/>");
                    }
                    catch(Exception e)
                    {
                        System.out.print(e);
                        e.printStackTrace();
                    }     

                        try
                    {
                   // Class.forName("com.mysql.jdbc.Driver");
                    //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
                   // Statement st=conn.createStatement();
                    ResultSet rs =null;
                    ResultSet rs1=null;
                    ResultSet rs2=null;
                    ResultSet rs3=null;
                    ResultSet rs4=null;
                   String cosum=null;
                   String co1sum=null;
                   String co2sum=null;
                   String co3sum=null;
                   String co4sum=null;
                   PreparedStatement st=null;
                   PreparedStatement st1=null;
                   PreparedStatement st2=null;
                   PreparedStatement st3=null;
                    PreparedStatement st4=null;
                    String sql="select Sum(co) as totalco from Question";
                   
                    st= connection.prepareStatement(sql);
                    st1=connection.prepareStatement("select SUM(marks) as totalco1 from Question where co=? and testno=?");
                    st1.setString(1,"1");
                    st1.setString(2,n);
                    st2=connection.prepareStatement("select SUM(marks) as totalco2 from Question where co=? and testno=?");
                    st2.setString(1,"2");
                    st2.setString(2,n);
                    st3=connection.prepareStatement("select SUM(marks) as totalco3 from Question where co=? and testno=?");
                    st3.setString(1,"3");
                    st3.setString(2,n);
          
                    st4=connection.prepareStatement("select SUM(marks) as totalco4 from Question where co=? and testno=?");
                    st4.setString(1,"4");
                    st4.setString(2,n);
                    
                    rs= st.executeQuery();
                    rs1=st1.executeQuery();
                    rs2=st2.executeQuery();
                    rs3=st3.executeQuery();
                    rs4=st4.executeQuery();
                    if(rs.next())
                    { 
                    cosum =rs.getString("totalco");
                     }
                    if(rs1.next())
                    { 
                    co1sum =rs1.getString("totalco1");
                     }
                    if(rs2.next())
                    { 
                    co2sum =rs2.getString("totalco2");
                     }
                    if(rs3.next())
                    { 
                    co3sum =rs3.getString("totalco3");
                     }
                    if(rs4.next())
                    { 
                    co4sum =rs4.getString("totalco4");
                     }
                    session.setAttribute("co",cosum);
                    session.setAttribute("co1",co1sum);
                    session.setAttribute("co2",co2sum);
                    session.setAttribute("co3",co3sum);
                    session.setAttribute("co4",co4sum);
                   }
                    catch(Exception e)
                    {
                        System.out.print(e);
                        e.printStackTrace();
                    }    
                        try
                        {
                            String po1sum=null;
                            String po2sum=null;
                            String po3sum=null;
                            PreparedStatement st5=connection.prepareStatement("select Sum(marks) as totalpo1 from Question where po in(?,?) and where testno in(?)");
                             PreparedStatement st6=connection.prepareStatement("select Sum(marks) as totalpo2 from Question where po in(?,?) and testno=?");
                              PreparedStatement st7=connection.prepareStatement("select Sum(marks) as totalpo3 from Question where po in(?,?) and testno=?");
                           st5.setString(1,"1");
                           st5.setString(2,"2");
                           st5.setString(3,n);
                           st6.setString(1,"3");
                           st6.setString(2,"4");
                           st5.setString(3,n);
                           st7.setString(1,"5");
                           st7.setString(2,"6");
                                   st5.setString(3,n);
                           ResultSet rs5=st5.executeQuery();
                           ResultSet rs6=st6.executeQuery();
                           ResultSet rs7=st7.executeQuery();
                           
                            if(rs5.next())
                            {
                                po1sum=rs5.getString("totalpo1");
                            }
                             session.setAttribute("po1",po1sum);
                        if(rs6.next())
                            {
                                po2sum=rs6.getString("totalpo2");
                            }
                             session.setAttribute("po2",po2sum);
                             if(rs7.next())
                            {
                                po3sum=rs7.getString("totalpo3");
                            }
                             session.setAttribute("po1",po1sum);
                        }
                       catch(Exception e)
                    {
                        System.out.print(e);
                        e.printStackTrace();
                    }   


try{
    PreparedStatement ps=null;
//String sql ="select * from Question where testno=?";
ps=connection.prepareStatement("select * from Question where testno=?");

ps.setString(1, n);
resultSet = ps.executeQuery();

//resultSet = statement.executeQuery(sql);
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
      out.write("<td>CO");
      out.print(resultSet.getString("co") );
      out.write("</td>\n");
      out.write("<td>L");
      out.print(resultSet.getString("po") );
      out.write("</td>\n");
      out.write("<br/>\n");
      out.write("</tr>\n");

}

connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<br/><br/>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("    <tr><h4>Expected Course Outcomes</h4></tr>\n");
      out.write("    ");

    connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
statement=connection.createStatement();

try{
    

PreparedStatement stm=null;
String SqlQuery="select * from $tablename";
String query=SqlQuery.replace("$tablename", n1);
stm=connection.prepareStatement(query);
resultSet=stm.executeQuery();
while(resultSet.next()){

      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(resultSet.getString("CO") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Outcomes") );
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");

}

connection.close();
} catch (Exception e) {
e.printStackTrace();
}
//}


      out.write("\n");
      out.write("</table><br/><br/>\n");
      out.write("<table border=\"1\">\n");
      out.write("    \n");
      out.write("    <tbody border=\"1\">\n");
      out.write("        <tr>Marks Distribution</tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>CO1:");
      out.print(session.getAttribute("co1"));
      out.write("</td>\n");
      out.write("            <td>CO2:");
      out.print(session.getAttribute("co2"));
      out.write("</td>\n");
      out.write("            <td>CO3:");
      out.print(session.getAttribute("co3"));
      out.write("</td>\n");
      out.write("            <td>CO4:");
      out.print(session.getAttribute("co4"));
      out.write("</td>\n");
      out.write("            <td>L1,L2:");
      out.print(session.getAttribute("po1"));
      out.write("</td>\n");
      out.write("            <td>L3,L4:");
      out.print(session.getAttribute("po2"));
      out.write("</td>\n");
      out.write("            <td>L5,L6:");
      out.print(session.getAttribute("po3"));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("        <!--<button type=\"submit\" value=\"submit\" onclick=\"sum.html\">-->\n");
      out.write("           <div id=\"printPageButton\"> \n");
      out.write("       <button type=\"submit\"  onclick=\"window.print()\">print</button>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("    </form>\n");
      out.write("    </body>\n");
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
