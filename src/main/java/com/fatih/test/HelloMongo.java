package com.fatih.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class HelloMongo {

	public static void main(String[] args) {
		
		String userName="root";
		String dbName="deneme";
		String pwd="sa123";
		try{
		//MongoCredential credential=MongoCredential.createCredential(userName, dbName, pwd.toCharArray());
		
		//MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(credential));
		
		MongoClient mongoClient=new MongoClient("localhost" , 27017);
		
		MongoDatabase database=mongoClient.getDatabase("deneme");
		
		
		
		Document document=new Document();
		
		document.put("name", "ali");
		document.put("surname", "kara");
		document.put("age", 32);
		document.put("createdDate", new Date());
		
		database.getCollection("users").insertOne(document);
		
		System.out.println("Veri ekleme baþarýlý"); 
		
		}catch(Exception e){
			
			e.printStackTrace();
			
			System.out.println("Veri ekleme baþarýsýz");
		}
		
		
		
		
		
	}
	
	
	
	
}
