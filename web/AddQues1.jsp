 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
//int no=Integer.parseInt(request.getParameter("no"));
String no=request.getParameter("no");
String name=request.getParameter("name");
int marks=Integer.parseInt(request.getParameter("marks"));
int co=Integer.parseInt(request.getParameter("co"));
int po=Integer.parseInt(request.getParameter("po"));
String n=(String)session.getAttribute("type");
String sub=(String)session.getAttribute("subject");
try
{
Statement st=null;
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
st=conn.createStatement();
int i=st.executeUpdate("insert into Question (no,name,marks,co,po,testno,sub)values('"+no+"','"+name+"','"+marks+"','"+co+"','"+po+"','"+n+"','"+sub+"')");
out.println("Data is successfully inserted!");
//out.println("<br/><br/><html><body><a href='AddQues.jsp'>Add Another Question</a></body</html>");

}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%> 
