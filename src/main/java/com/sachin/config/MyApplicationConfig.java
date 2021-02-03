package com.sachin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
public class MyApplicationConfig {
	@Bean
	public MongoTemplate getMongoTemplate(MongoDbFactory mongoDbFactory) {
		return new MongoTemplate(mongoDbFactory);
	}

	@Bean
	public MongoDbFactory getMongoDBfactory() {
		return new SimpleMongoDbFactory(new MongoClient("localhost", 27017),"sachin");
	}

}
