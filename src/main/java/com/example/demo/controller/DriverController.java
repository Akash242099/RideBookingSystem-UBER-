package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DriverService;
import com.example.demo.enums.DriverStatus;
import com.example.demo.model.Driver;
import com.example.demo.model.Location;

@RestController
@RequestMapping("/driver")
public class DriverController {
	
	   @Autowired
	    DriverService driverService;
	    
	    @GetMapping("/{greet}")
	    public String greetings(@PathVariable String greet) {
			return "Hello World";
	    	
	    }

	    @GetMapping("/drivers")
	    public List<Driver> getDrivers(){
	    
	    	return driverService.getDriverList();
	    }
	    @PostMapping("/addDriver")
	    public Driver addDriver(@RequestBody Driver driver) {
	        return driverService.addDriver(driver);
	    }
	    
//	    @PostMapping("/addDrivers")
//	    public void addDrivers(@RequestBody List<Driver> driver) {
//	    	driverService.addDrivers(driver);
//	    }
	    
	    @PutMapping("/{id}")
	    public Driver updateDriver(@PathVariable int id,@RequestBody Driver driver){
			return driverService.updateDriver(id,driver);
	    	
	    	
	    }

	    @PatchMapping("/{id1}")
	    public Driver updateDriverDetails(@PathVariable int id,@RequestBody Map<Object,Object> driverMap){
			return driverService.updateDriverDetails(id,driverMap);
	    	
	    	
	    }

//	@PatchMapping("/{id1}")
//	public Driver updateDriverDetails(@PathVariable int id,@RequestBody Map<Object,Object> driverMap){
//		return driverService.updateDriverDetails(id,driverMap);
//
//
//	}
//	    
//	    @PatchMapping("/{id2}")
//	    public Driver updateDriverStatus(@PathVariable int id,@RequestBody DriverStatus driverStatus){
//			return driverService.updateDriverStatus(id,driverStatus);
//	    	
//	    	
//	    }
	    
//	    @PatchMapping("/{id}")
//	    public Driver updateDriverLocation(@PathVariable int id,@RequestBody Location location){
//			return driverService.updateDriverLocation(id,location);
//	    	
//	    	
//	    }

}
