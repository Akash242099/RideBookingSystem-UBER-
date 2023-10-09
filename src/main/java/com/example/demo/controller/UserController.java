package com.example.demo.controller;

import com.example.demo.Service.DriverService;
import com.example.demo.Service.UserService;
import com.example.demo.Service.UserServiceImpl;
import com.example.demo.model.Location;
import com.example.demo.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    UserService userService;
    
    @GetMapping("/{greet}")
    public String greetings(@PathVariable String greet) {
		return "Hello World";
    	
    }

    @GetMapping("/users")
    public List<User> getUsers(){
    
    	return userService.getUserList();
    }
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
    
    @PostMapping("/addUsers")
    public void addUsers(@RequestBody List<User> user) {
    	userService.addUsers(user);
    }
    
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id,@RequestBody User user){
		return userService.updateUser(id,user);
    	
    	
    }

    @PatchMapping("/{id}")
    public User updateUserLocation(@PathVariable int id,@RequestBody Location location){
		return userService.updateUserLocation(id,location);
    	
    	
    }


}
