 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
    PreparedStatement ps=null;
String id=request.getParameter("no");
String n=(String)session.getAttribute("type"); 


try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
Statement st=conn.createStatement();
//int i=st.executeUpdate("DELETE FROM Question WHERE no="+id);
//out.println("Data Deleted Successfully!");
String sql="DELETE FROM QUESTION WHERE no=? and testno=?";
ps=conn.prepareStatement(sql);

ps.setString(1, id);
ps.setString(2, n);
int i=ps.executeUpdate();
//for(j=p;j<10;j++)
//{   
    
//    int y=st.executeUpdate("update question set no=no-1 where no="+j);
    
//}
out.println("<br/><br/><html><body><a href='DelAll.jsp'>Delete Whole Question Paper</a></body></html>");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%> 