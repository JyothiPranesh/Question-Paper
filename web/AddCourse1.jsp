<%-- 
    Document   : AddCourse1
    Created on : May 23, 2020, 7:09:55 PM
    Author     : dell
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%
           String cname=request.getParameter("cname");
           String code=request.getParameter("code");
           session.setAttribute("cname",cname);
           Connection con=null;
      Statement statement = null;
      PreparedStatement ps=null;
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
          statement=con.createStatement();
          String sql="INSERT INTO COURSE(name,code) values(?,?)";
          
          ps=con.prepareStatement(sql);
          ps.setString(1, cname);
          ps.setString(2,code);
          int i=ps.executeUpdate();
       %><br/><br/><a href="AddOut.jsp">OUTCOMES</a>
      <%}
      catch(SQLException e)
{
out.println(e);
}
         
%>