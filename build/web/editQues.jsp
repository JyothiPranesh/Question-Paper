<%@page language="java"%>
<%@page import="java.sql.*"%>

<%
     PreparedStatement ps=null;
      String id=request.getParameter("no");
      String n=(String)session.getAttribute("type"); 
try {
  
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
String query = "select * from Question where no=? and testno=?";
Statement st = conn.createStatement();
ps=conn.prepareStatement(query);

ps.setString(1, id);
ps.setString(2, n);
//int i=ps.executeUpdate();
ResultSet rs = ps.executeQuery();
if(rs.next()){
%>
<form action="editQues1.jsp" method="post">

<table>    Question no:
        <tr><input type="text" name="no"  size=70 value="<%=rs.getString("no")%>"></tr>
<br/><br/>
Question:&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="name" size="70" value="<%=rs.getString("name")%>">
<br/><br/>
Marks:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="marks" size="70" value="<%=rs.getString("marks")%>"><br/><br/>

CO:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="co" size="70" value="<%=rs.getString("co")%>"><br/><br/>
PO:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="po" size="70" value="<%=rs.getString("po")%>"><br/><br/>
<br/><input type="submit" value="submit"></form></table><br/><br/>

<%
    String no=request.getParameter("no");
    session.setAttribute("did",no);
}
}
catch(Exception e){}
%>
