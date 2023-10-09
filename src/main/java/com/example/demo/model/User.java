package com.example.demo.model;

import com.example.demo.enums.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User extends Person{

	

	

	public User() {
		super();
	}
	public User(int id ,int age2, String name2,Gender gender,Location location) {
		super(id,age2, name2,gender,location);
		// TODO Auto-generated constructor stub
	}

	
//	@JsonProperty("age")
//	private int age;
//	 @JsonProperty("name")
//    private String name;
	 
//	 public int getAge() {
//		 return age;
//	 }

}