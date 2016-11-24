
	
	package com.fatih.test;



	import org.bson.Document;

	import com.mongodb.Block;
	import com.mongodb.MongoClient;
	import com.mongodb.client.FindIterable;
	import com.mongodb.client.MongoDatabase;

	

	public class VeriSilme {
		
		public static void main(String[] args) {
		    MongoClient mongoClient=null;
		   
		    try {
		        mongoClient = new MongoClient("localhost", 27017);
		        MongoDatabase database = mongoClient.getDatabase("deneme");
		        
		       
		        //deleteOne verilen kritere göre eþleþen ilk sýradaki veriyi siler...
		       //database.getCollection("users").deleteOne(new Document("name","veli"));
		       
		        
		        //deleteMany verilen kritere göre eþleþen tüm verileri siler...
		        database.getCollection("users").deleteMany(new Document("name","veli"));
		       
		       
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
		
		
		
		





