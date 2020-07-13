 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
    PreparedStatement ps=null;
    String n=(String)session.getAttribute("type");
    String n1=(String)session.getAttribute("subject");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
Statement st=conn.createStatement();
//int i=st.executeUpdate("DELETE FROM QUESTION where type=? and subject=?");
ps=conn.prepareStatement("delete from Question where testno=? and sub=?");

ps.setString(1, n);
ps.setString(2,n1);
int i=ps.executeUpdate();
out.println("ALL DATA DELETED");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%> 
