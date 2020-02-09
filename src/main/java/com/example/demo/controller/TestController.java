package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping(value = "mongo", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getDataFromMongodb() {
		return mongoTemplate.findById("5e3f8c76b964cc34f9cb7a54", String.class, "test");
	}
}
