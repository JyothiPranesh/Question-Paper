<%-- 
    Document   : DelSub1
    Created on : May 23, 2020, 8:19:23 PM
    Author     : dell
--%>

 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
    String username=request.getParameter("name");


PreparedStatement ps=null;
try
{

Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
Statement st=conn.createStatement();
String sql1="DELETE FROM course WHERE name=?";
ps=conn.prepareStatement(sql1);

ps.setString(1, username);
int i=ps.executeUpdate();
//out.println("Data Deleted Successfully!");

}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
try
{

Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
Statement st=conn.createStatement();
String sql1="DELETE FROM Teacher WHERE subject=?";
ps=conn.prepareStatement(sql1);

ps.setString(1, username);
int i=ps.executeUpdate();
out.println("Data Deleted Successfully!");

}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}


%> 