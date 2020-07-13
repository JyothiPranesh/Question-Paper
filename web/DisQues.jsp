
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
    <head>
         
  <!--<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
-->
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

    <style>
            
            body{
                height: 297mm;
                width: 210mm;
                margin-left: auto;
      
                margin-right: auto;
                
            }
        .mydiv{
        text-align:right;
        }
        .UpperTitle
    {
    text-align: center;
    padding: 40px 0;
 
    font-weight:bold;
   
    border-radius: 10px;
    position: rela1tive;
    }
.UpperTitle img { position: absolute; left: 100px; top: 35px;  }
        @media print
        {
            #printPageButton{
                display:none;
            }
        }
        
        </style>
        
    </head>
<body>
    <div id="hell">
    <form>
    <div class="UpperTitle">
  <img src="C:\Users\dell\Downloads\rvce.jpg" width="150" height="150"/>
<center>
    <h2 style="font-size:20px">RV COLLEGE OF ENGINEERING</h2>
<h4  style="font-size:20px">(Autonomous Institution Affiliated to VTU)<br/>
Department of Master of Computer Applicaton<br/>
Continous Internal Evaluation</h4>
<%
   
  String n=(String)session.getAttribute("type");  
  String n1=(String)session.getAttribute("subject");
String n3=(String)session.getAttribute("code");
String n2=(String)session.getAttribute("sem1");
String n4=(String)session.getAttribute("time");
String n5=(String)session.getAttribute("maxmarks");
String n6=(String)session.getAttribute("name");
out.println("Semester:"+n2+"<br/>");
 out.print(n+"<br/>");  
 out.print("Subject:"+n1+"("+n3+")<br/>");  
 // out.print("code:"+n3+"<br/>");
%>
<hr>
</div>
<%
out.println("Faculty:"+n6);
%>
<br/>
<center><%
out.println("Answer All Questions");
%></center><br/>
<%
    out.println("Time:90 Min");%>
   <div class ="mydiv">
   <% out.print("Max.Mar:"+50);
%>
</div>
<br/>
<center>
<table class="table table-bordered">
<!--<table border="1">-->
<tr>
    <td style="width:2%">Question no</td>
<td style="width:40%">Question</td>
<td style="width:1%">Marks</td>
<td style="width:1%">CO</td>
<td style="width:1%">PO</td>

</tr>
<%
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
statement=connection.createStatement();
                    try
                    {
                   // Class.forName("com.mysql.jdbc.Driver");
                    //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
                   // Statement st=conn.createStatement();
                    ResultSet rs =null;
          
                   String markssum=null;
                   PreparedStatement st=null;
                   
                     String sql="select Sum(marks) as totalmarks from Question";
                   
                     st= connection.prepareStatement(sql);
                  
                         rs= st.executeQuery();
                       
                    if(rs.next())
                    { 
                    markssum =rs.getString("totalmarks");
                     }
                    session.setAttribute("marks",markssum);
                    String mar=(String)session.getAttribute("marks");
                    //out.println("marks:"+mar+"<br/>");
                    }
                    catch(Exception e)
                    {
                        System.out.print(e);
                        e.printStackTrace();
                    }     

                        try
                    {
                   // Class.forName("com.mysql.jdbc.Driver");
                    //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
                   // Statement st=conn.createStatement();
                    ResultSet rs =null;
                    ResultSet rs1=null;
                    ResultSet rs2=null;
                    ResultSet rs3=null;
                    ResultSet rs4=null;
                   String cosum=null;
                   String co1sum=null;
                   String co2sum=null;
                   String co3sum=null;
                   String co4sum=null;
                   PreparedStatement st=null;
                   PreparedStatement st1=null;
                   PreparedStatement st2=null;
                   PreparedStatement st3=null;
                    PreparedStatement st4=null;
                    String sql="select Sum(co) as totalco from Question";
                   
                    st= connection.prepareStatement(sql);
                    st1=connection.prepareStatement("select SUM(marks) as totalco1 from Question where co=? and testno=? and sub=?");
                    st1.setString(1,"1");
                    st1.setString(2,n);
                    st1.setString(3,n1);
                    st2=connection.prepareStatement("select SUM(marks) as totalco2 from Question where co=? and testno=? and sub=?");
                    st2.setString(1,"2");
                    st2.setString(2,n);
                    st2.setString(3, n1);
                    st3=connection.prepareStatement("select SUM(marks) as totalco3 from Question where co=? and testno=? and sub=?");
                    st3.setString(1,"3");
                    st3.setString(2,n);
                       st3.setString(3,n1);
          
                    st4=connection.prepareStatement("select SUM(marks) as totalco4 from Question where co=? and testno=? and sub=?");
                    st4.setString(1,"4");
                    st4.setString(2,n);
                    st4.setString(3, n1);
                    
                    rs= st.executeQuery();
                    rs1=st1.executeQuery();
                    rs2=st2.executeQuery();
                    rs3=st3.executeQuery();
                    rs4=st4.executeQuery();
                    if(rs.next())
                    { 
                    cosum =rs.getString("totalco");
                     }
                    if(rs1.next())
                    { 
                    co1sum =rs1.getString("totalco1");
                     }
                    if(rs2.next())
                    { 
                    co2sum =rs2.getString("totalco2");
                     }
                    if(rs3.next())
                    { 
                    co3sum =rs3.getString("totalco3");
                     }
                    if(rs4.next())
                    { 
                    co4sum =rs4.getString("totalco4");
                     }
                    session.setAttribute("co",cosum);
                    session.setAttribute("co1",co1sum);
                    session.setAttribute("co2",co2sum);
                    session.setAttribute("co3",co3sum);
                    session.setAttribute("co4",co4sum);
                   }
                    catch(Exception e)
                    {
                        System.out.print(e);
                        e.printStackTrace();
                    }    
                        try
                        {
                            String po1sum=null;
                            String po2sum=null;
                            String po3sum=null;
                            PreparedStatement st5=connection.prepareStatement("select Sum(marks) as totalpo1 from Question where po in(?,?) and testno in(?) and sub in(?)");
                             PreparedStatement st6=connection.prepareStatement("select Sum(marks) as totalpo2 from Question where po in(?,?) and testno in(?) and sub in(?)");
                              PreparedStatement st7=connection.prepareStatement("select Sum(marks) as totalpo3 from Question where po in(?,?) and testno in(?) and sub in(?)");
                           st5.setString(1,"1");
                           st5.setString(2,"2");
                           st5.setString(3,n);
                           st5.setString(4,n1);
                           st6.setString(1,"3");
                           st6.setString(2,"4");
                           st6.setString(3,n);
                           st6.setString(4,n1);
                           st7.setString(1,"5");
                           st7.setString(2,"6");
                                   st7.setString(3,n);
                                   st7.setString(4,n1);
                           ResultSet rs5=st5.executeQuery();
                           ResultSet rs6=st6.executeQuery();
                           ResultSet rs7=st7.executeQuery();
                           
                            if(rs5.next())
                            {
                                po1sum=rs5.getString("totalpo1");
                            }
                             session.setAttribute("po1",po1sum);
                        if(rs6.next())
                            {
                                po2sum=rs6.getString("totalpo2");
                            }
                             session.setAttribute("po2",po2sum);
                             if(rs7.next())
                            {
                                po3sum=rs7.getString("totalpo3");
                            }
                             session.setAttribute("po3",po3sum);
                        }
                       catch(Exception e)
                    {
                        System.out.print(e);
                        e.printStackTrace();
                    }   


try{
    PreparedStatement ps=null;
//String sql ="select * from Question where testno=?";
ps=connection.prepareStatement("select * from Question where testno=? and sub=?");

ps.setString(1, n);
ps.setString(2,n1);
resultSet = ps.executeQuery();

//resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("no") %></td>
<td><%=resultSet.getString("name") %></td>
<td><%=resultSet.getString("marks") %></td>
<td>CO<%=resultSet.getString("co") %></td>
<td>L<%=resultSet.getString("po") %></td>
<br/>
</tr>
<%
}

connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>

</table>
<br/><br/>

<table>
    <tr><h4>Expected Course Outcomes</h4></tr>
    <%
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
statement=connection.createStatement();

try{
    

PreparedStatement stm=null;
String SqlQuery="select * from $tablename";
String query=SqlQuery.replace("$tablename", n1);
stm=connection.prepareStatement(query);
resultSet=stm.executeQuery();
while(resultSet.next()){
%>

<tr>
<td><%=resultSet.getString("CO") %></td>
<td><%=resultSet.getString("Outcomes") %></td>


</tr>

<%
}

connection.close();
} catch (Exception e) {
e.printStackTrace();
}
//}

%>
</table><br/><br/>
<table border="1">
    
    <tbody border="1">
        <tr>Marks Distribution</tr>
        <tr>
            <td>CO1:<%=session.getAttribute("co1")%></td>
            <td>CO2:<%=session.getAttribute("co2")%></td>
            <td>CO3:<%=session.getAttribute("co3")%></td>
            <td>CO4:<%=session.getAttribute("co4")%></td>
            <td>L1,L2:<%=session.getAttribute("po1")%></td>
            <td>L3,L4:<%=session.getAttribute("po2")%></td>
            <td>L5,L6:<%=session.getAttribute("po3")%></td>
        </tr>
    </tbody>
</table>
</center>
        <!--<button type="submit" value="submit" onclick="sum.html">-->
           <div id="printPageButton"> 
               <button type="submit" onclick="window.print()">print</button>
           </div>
       </div>
    </form>
    </body>
</html>