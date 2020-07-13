<%-- 
    Document   : AddSub1
    Created on : May 13, 2020, 9:37:34 PM
    Author     : dell
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%String username=request.getParameter("username");
String subject=request.getParameter("subject1");
String sem=request.getParameter("sem");
try
{
    Statement st=null;
    Statement st1=null;
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/user", "root", "root");
    st=conn.createStatement();
     String queryCheck = "SELECT * from login WHERE username = ?";
     PreparedStatement ps = conn.prepareStatement(queryCheck);
     
    ps.setString(1, username);
     ResultSet resultSet = ps.executeQuery();
     Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
     st1=con1.createStatement();
     String queryCheck1="SELECT * from course WHERE name = ?";
     PreparedStatement ps1=con1.prepareStatement(queryCheck1);
     ps1.setString(1,subject);
     ResultSet rs=ps1.executeQuery();
     if(!(resultSet.absolute(1) && rs.absolute(1))) {
        out.println("First add the teacher and Subject");
         conn.close();
          return;
     }
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
try
{
Statement st=null;
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
st=conn.createStatement();
int i=st.executeUpdate("insert into teacher (name,subject,sem)values('"+username+"','"+subject+"','"+sem+"')");
out.println("Data is successfully inserted!");
//String u=(String)session.getAttribute("uname"); 
 
 
%>
<p>Add Another Subject to same teacher</p><br/>
<a href="sec.jsp">Back</a>
<%   
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>    


