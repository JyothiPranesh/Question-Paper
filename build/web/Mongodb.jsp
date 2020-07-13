<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page import="org.bson.Document"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%

	String co1=(String)session.getAttribute("co1");
        String co2=(String)session.getAttribute("co2");
        String co3=(String)session.getAttribute("co3");
        String co4=(String)session.getAttribute("co4");
	// Creating a Mongo client
	MongoClient mongo = new MongoClient( "localhost" , 27017 );
	
	// Accessing the database
	MongoDatabase database = mongo.getDatabase("project");
	
	// Creating a collection
	database.createCollection("sampleCollection");
	System.out.println("Collection created successfully");
	
	// Retrieving a collection
	MongoCollection<Document> collection = database.getCollection("sc");
	System.out.println("Collection sampleCollection selected successfully");
	Document document = new Document("co1", co1)
	.append("co2", co2)
	.append("co3", co3)
	.append("co4", co4);
	
	//Inserting document into the collection
	collection.insertOne(document);
	System.out.println("Document inserted successfully");


%>