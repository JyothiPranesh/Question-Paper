<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        @import url(https://fonts.googleapis.com/css?family=Roboto:300);
.body{
}

.login-page {
  width: 360px;
  padding: 8% 0 0;
  margin: auto;
  
}
.form {
  position: relative;
  z-index: 1;
  background: #489ac975;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
  
}
.form input,select {
  font-family: FontAwesome, "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 20%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
  
}
.form button {
  font-family: "Titillium Web", sans-serif;
  font-size: 14px;
  font-weight: bold;
  letter-spacing: .1em;
  outline: 0;
  background-color: #1784a5;
  width: 100%;
  border: 0;
  margin: 0px 0px 8px;
  padding: 15px;
  color: #FFFFFF;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;


}
.form button:hover,.form button:active,.form button:focus {
  background-color: #148f77;
}


.form .message {
  
  margin: 6px 6px;
  color: #808080;
  font-size: 11px;
  text-align: center;
  font-weight: bold;
  font-style: normal;

  

}
.form .message a {
  color: #FFFFFF;
  text-decoration: none;
  font-size: 13px;
}
.form .register-form {
  display: none;
}
.container {
  position: relative;
  z-index: 1;
  max-width: 300px;
  margin: 0 auto;
}
.container:before, .container:after {
  content: "";
  display: block;
  clear: both;
}
.container .info {
  margin: 50px auto;
  text-align: center;
}
.container .info h1 {
  margin: 0 0 15px;
  padding: 0;
  font-size: 36px;
  font-weight: 300;
  color: #1a1a1a;
}
.container .info span {
  color: #4d4d4d;
  font-size: 12px;
}
.container .info span a {
  color: #000000;
  text-decoration: none;
}
.container .info span .fa {
  color: #EF3B3A;
}
body {
  background: #76b852; /* fallback for old browsers */
  background: -webkit-linear-gradient(right, #76b852, #8DC26F);
  background: -moz-linear-gradient(right, #76b852, #8DC26F);
  background: -o-linear-gradient(right, #76b852, #8DC26F);
  background: linear-gradient(to left, #52b8aa, #8DC26F);
  font-family: "Roboto", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;      
}
    </style>
<title>Insert title here</title>
</head>
<body bgcolor="Blue-gray"><center>
    <form action="Userj" method="get"> 
    
  
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
             String sem=request.getParameter("sem");
        session.setAttribute("sem",sem);
      
          String name=(String)session.getAttribute("name");
          String n3=(String)session.getAttribute("sem");
          //String n3=request.getParameter("sem");
          session.setAttribute("sem1",sem);
          String sql="SELECT subject from teacher where name=? and sem=?";
          
          ps=con.prepareStatement(sql);
          ps.setString(1, name);
          ps.setString(2, n3);
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
        <h1 style="color:red">Select the Examination</h1><br/><br/>
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