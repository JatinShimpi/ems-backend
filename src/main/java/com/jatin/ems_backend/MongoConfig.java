package com.jatin.ems_backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig {

    @Bean
    public MongoTemplate mongoTemplate() {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://jls943754:zVkOvc1KkiG9ejvY@cluster0.xtgoy.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");  // Mongo URI
        return new MongoTemplate(mongoClient, "your-database-name");  // Replace with your database name
    }
}
