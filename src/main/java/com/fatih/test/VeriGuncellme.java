
	
	package com.fatih.test;



	import org.bson.Document;

	import com.mongodb.Block;
	import com.mongodb.MongoClient;
	import com.mongodb.client.FindIterable;
	import com.mongodb.client.MongoDatabase;

	

	public class VeriGuncellme {
		
		public static void main(String[] args) {
		    MongoClient mongoClient=null;
		   
		    try {
		        mongoClient = new MongoClient("localhost", 27017);
		        MongoDatabase database = mongoClient.getDatabase("deneme");
		        
		       
		        
		       database.getCollection("users").updateOne(new Document("name", "ali" ),new Document("$set",new Document("age",33)).append("$set", new Document("surname","yýldýz")));
		       
		       FindIterable<Document> iterable=database.getCollection("users").find();
		        
		        iterable.forEach(new Block<Document>() {

					@Override
					public void apply(Document document) {
						
						System.out.println(document);
					}
		        	
		        	
		        	
		        	
		        	
		        	
				});
		        
		        
		        

		       
		    } catch (Exception e) {
		        System.err.println("Bir Hata Meydana Geldi!");
		        System.out.println("Hata" + e);
		    }finally{
		    	mongoClient.close();
		    }
		} 

	}
		
		
		
		





