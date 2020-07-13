 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
    String username=request.getParameter("name");

/*try
{
   
    Statement st=null;
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
    st=conn.createStatement();
     String queryCheck = "SELECT * from login WHERE username = ?";
     PreparedStatement ps = conn.prepareStatement(queryCheck);
     
    ps.setString(1, username);
     ResultSet resultSet = ps.executeQuery();
     
     if(!resultSet.absolute(1)) {
        out.println("Their is no Teacher to delete");
         conn.close();
          return;
     }
   }
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}*/
PreparedStatement ps=null;
try
{

Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
Statement st=conn.createStatement();
String sql1="DELETE FROM Teacher WHERE name=?";
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
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/user", "root", "root");
Statement st=conn.createStatement();
String sql1="DELETE FROM login WHERE username=?";
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
         //out.println("hi");
        //Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
        //Statement st1=conn1.createStatement();
       
        //Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
        //Statement st2=conn.createStatement();
        //int x=st.executeUpdate("DELETE FROM login WHERE username"+username);
 
     

%> 