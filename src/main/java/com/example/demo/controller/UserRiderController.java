package com.example.demo.controller;

import com.example.demo.Service.UserRiderService;
import com.example.demo.Service.UserService;
import com.example.demo.model.Driver;
import com.example.demo.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user-rider")
public class UserRiderController {


    @Autowired
    UserRiderService userRiderService;

    @GetMapping("/findRide")
    public List<Driver> findRide(@RequestBody List<Location> locations){
        return userRiderService.getAvailableRides(0,locations);
    }

    @GetMapping("/chooseRide")
    public Driver findRide(){
        return userRiderService.chooseAvailableRides();
    }

}
