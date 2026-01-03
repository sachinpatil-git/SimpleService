package com.sachin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.dto.User;

@RestController
public class MyApplicationController {
	@Autowired
	MongoTemplate mongoTemplate;

	@RequestMapping(value = "/")
	public void saveUser() {
		User user = new User();
		user.setUserId(1);
		user.setUserName("VIKAS");
		mongoTemplate.save(user);
	}

	@RequestMapping(value = "/get")
	public void getUsers() {
		List<User> list = mongoTemplate.findAll(User.class);
		for (User user : list) {
System.out.println("UserId : " +user.getUserId() +"  Username : " +user.getUserName());
		}

	}

	@RequestMapping(value = "/test")
	public String test() {
  return "!!!!! Hello World !!!!!":
		}

	}

}
