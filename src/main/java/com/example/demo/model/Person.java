package com.example.demo.model;

import com.example.demo.enums.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

//@JsonDeserialize(as = User.class)
public abstract class Person {


	@JsonProperty("age")
	private int age;

	@JsonProperty("name")
	private String name;
	
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@JsonProperty("id")
	 private int  id ;

	@JsonProperty("gender")
	private Gender gender;
	
	@JsonProperty("location")
    private Location location;
  
	public Person() {
		super();
	}

	public Person(int id ,int age2, String name2,Gender gender,Location location) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.age=age2;
		this.name = name2;
		this.gender = gender;
		this.location=location;

		// this.location=location2;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Gender getGender() {
		return gender;
	}

	public Location getLocation() {
		return location;
	}


	//    public Person(int age, String name, Gender gender,Location location) {
	//        this.age = age;
	//        this.name = name;
	//        this.gender = gender;
	//        this.location=location;
	//    }
	//




}
