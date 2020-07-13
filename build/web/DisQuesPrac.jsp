
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%

String driver = "com.mysql.jdbc.Driver";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>
<center>
<table border="1">
<tr>
<td>Question no</td>
<td>Question</td>
<td>Marks</td>
<td>CO</td>
<td>PO</td>

</tr>
<%

try{

String no=resultSet.getString("no");
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
statement=connection.createStatement();
String sql ="select * from Question order by no ASC";

 
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

%>
<td><%=resultSet.getString("no") %></td>
<td><%=resultSet.getString("name") %></td>
<td><%=resultSet.getString("marks") %></td>
<td><%=resultSet.getString("co") %></td>
<td><%=resultSet.getString("po") %></td>
<td><a href="DelQues1.jsp?no=<%=resultSet.getString("no") %>"><button type="button" class="delete">Delete</button></a></td>

<br/>
<br/><br/>

<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
<a href="DisQues.jsp">Final Question Paper</a><br/><br/>
<a href="DelAll.jsp">Delete whole Question Paper</a><br/><br/>
</center>
</body>
</html>