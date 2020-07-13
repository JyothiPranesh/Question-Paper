<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
    <form action="Userj" method="get">
    <h1>Login success</h1>
    <h1>CLICK HERE TO CONTINUE</h1>
    <h1>select the Examination</h1><br/><br/>
   <select id="sem" name="sem">
  <option value="Semester 1">Semester 1</option>
  <option value="Semester 2">Semester 2</option>
  <option value="Semester 3">Semester 3</option>
  <option value="Semester 4">Semester 4</option>
  <option value="Semester 5">Semester 5</option>
  <option value="Semester 6">Semester 6</option>
  
 
   </select>
  <br/><br/>
  <%
      Connection con=null;
      Statement statement = null;
      PreparedStatement ps=null;
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
          statement=con.createStatement();
          String name=(String)session.getAttribute("name");
          String sql="SELECT * from Teacher where name=?";
          
          ps=con.prepareStatement(sql);
          ps.setString(1, name);
          ResultSet rs=ps.executeQuery();
          %>
          <p>Select Subject:
              <select id="sub" name="sub">
                  <%
                      while(rs.next())
                      {
                          String subject=rs.getString("subject");
                          %>
                          <option value="<%=subject %>"><%=subject %></option>
                          <%
                              }
                              %>
              </select>
          </p>
          <%
              }
catch(SQLException e)
{
out.println(e);
}
%>
      
  
  
  <br/>
    <br/><br/>
        <h1>select the Examination</h1><br/><br/>
   <select id="type" name="type">
  <option value="Test 1">Theory1</option>
  <option value="Test 2">Theory2</option>
  <option value="Test 3">Theory3</option>
 <!-- <option value="Quiz 1">Quiz1</option>
  <option value="Quiz 2">Quiz2</option>-->
   </select>
  <br/><br/><br/>
 <!--<h1>select the Subject</h1><br/><br/>
  <select id="subject" name="subject">
  <option value="EAP">EAP</option>
  <option value="STP">STP</option>
  <option value="JAVA">JAVA</option>
  
</select>--><br/><br/>
<!--<center>
  Time<input type="text" name="time"><br/><br/>
  Max Marks<input type="text" name="maxmarks"><br/><br/>
</center>-->

    <input type="submit" value="SUBMIT">
</form>
</center>
</body>
</html>