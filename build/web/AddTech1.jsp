 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
   
String username=request.getParameter("username");
String password=request.getParameter("password");
PreparedStatement ps=null;
try
{
Statement st=null;
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/user", "root", "root");
st=conn.createStatement();
String sql="insert into login (username,password)values(?,?)";
ps=conn.prepareStatement(sql);

ps.setString(1, username);
ps.setString(2, password);
int i=ps.executeUpdate();
out.println("Data is successfully inserted!");
//String u=(String)session.getAttribute("uname"); 
 
 session.setAttribute("username",username); 
  
        
  
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%> 
