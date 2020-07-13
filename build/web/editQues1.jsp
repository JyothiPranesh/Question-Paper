<%-- 
    Document   : editQues1
    Created on : May 23, 2020, 11:34:08 AM
    Author     : dell
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
 PreparedStatement ps=null;
    
      String n1=(String)session.getAttribute("type"); 
try
{
    String id=(String)session.getAttribute("did");
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
Statement st=conn.createStatement();
String query="DELETE FROM Question WHERE no=? and testno=?";
ps=conn.prepareStatement(query);

ps.setString(1, id);
ps.setString(2, n1);
int i=ps.executeUpdate();

//out.println("Data Deleted Successfully!");

//out.println("<br/><br/><html><body><a href='DelAll.jsp'>Delete Whole Question Paper</a></body></html>");

}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
try
{
 
    
    String n=(String)session.getAttribute("type");
String sub=(String)session.getAttribute("subject");
    String no=request.getParameter("no");
String name=request.getParameter("name");
int marks=Integer.parseInt(request.getParameter("marks"));
int co=Integer.parseInt(request.getParameter("co"));
int po=Integer.parseInt(request.getParameter("po"));
Statement st=null;
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
st=conn.createStatement();
int i=st.executeUpdate("insert into Question (no,name,marks,co,po,testno,sub)values('"+no+"','"+name+"','"+marks+"','"+co+"','"+po+"','"+n+"','"+sub+"')");
out.println("Data is successfully Updated");
//out.println("<br/><br/><html><body><a href='AddQues.jsp'>Add Another Question</a></body</html>");

}


catch(Exception e)
{
   e.printStackTrace();
   
}
%> 