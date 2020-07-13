<%-- 
    Document   : mongodb1
    Created on : May 19, 2020, 10:13:22 AM
    Author     : dell
--%>
<%@page import="org.bson.Document"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="com.mongodb.MongoClient"%>
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
<html>
    <head>
        <style>
        .mydiv{
        text-align:right;
        }
        </style>
    </head>
    <body>
        <br/>
<center>
<%
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "root");
statement=connection.createStatement();
              
try{     
String sql ="select * from Question";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
           String no=resultSet.getString("no");
            String co=resultSet.getString("co");
    MongoClient mongo = new MongoClient( "localhost" , 27017 );
	
	// Accessing the database
	MongoDatabase database = mongo.getDatabase("test");
	
	// Creating a collection
	//database.createCollection("test");
	//System.out.println("Collection created successfully");
	
	// Retrieving a collection
       
	MongoCollection<Document> collection = database.getCollection("test");
	System.out.println("Collection sampleCollection selected successfully");
	Document document = new Document("no",no)
	
	.append("co",co); 
	
	//Inserting document into the collection
	collection.insertOne(document);
        
	System.out.println("Document inserted successfully");
}
%>
<br/>
</tr>
<%
    

}catch(SQLException e)
{
e.printStackTrace();
}
connection.close();
%>