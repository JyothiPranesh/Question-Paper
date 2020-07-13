<%-- 
    Document   : AddOut1
    Created on : May 23, 2020, 7:16:05 PM
    Author     : dell
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String co1=request.getParameter("co1");
    String co2=request.getParameter("co2");
    String co3=request.getParameter("co3");
    String co4=request.getParameter("co4");
String cname=(String)session.getAttribute("cname");
Connection con=null;
      Statement statement = null;
      PreparedStatement ps=null;
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
          statement=con.createStatement();
          String sql="CREATE TABLE $TABLE(CO VARCHAR(20),Outcomes VARCHAR(20))";
          String table=sql.replace("$TABLE", cname);
          ps=con.prepareStatement(table);
         
     
          int i=ps.executeUpdate();
          String sql1="INSERT INTO $TABLE (CO,OUTCOMES) VALUES('1',?)";
          String table1=sql1.replace("$TABLE",cname);
          ps=con.prepareStatement(table1);
          ps.setString(1,co1);
          int k=ps.executeUpdate();
          String sql2="INSERT INTO $TABLE (CO,OUTCOMES) VALUES('2',?)";
          String table2=sql2.replace("$TABLE",cname);
          ps=con.prepareStatement(table2);
          ps.setString(1,co2);
          int l=ps.executeUpdate();
          String sql3="INSERT INTO $TABLE (CO,OUTCOMES) VALUES('3',?)";
          String table3=sql3.replace("$TABLE",cname);
          ps=con.prepareStatement(table3);
          ps.setString(1,co3);
          int m=ps.executeUpdate();
          String sql4="INSERT INTO $TABLE (CO,OUTCOMES) VALUES('4',?)";
          String table4=sql4.replace("$TABLE",cname);
          ps=con.prepareStatement(table4);
          ps.setString(1,co4);
          int n=ps.executeUpdate();
          //out.println("created");
          out.println("inserted");
      }
      catch(SQLException e)
{
out.println(e);
}
          
       %>