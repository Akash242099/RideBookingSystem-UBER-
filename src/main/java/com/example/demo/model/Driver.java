package com.example.demo.model;

import com.example.demo.enums.DriverStatus;
import com.example.demo.enums.Gender;

public class Driver extends Person {


    private Vehicle vehicle;
    private int no_of_rides;


    public DriverStatus getDriverStatus() {
        return driverStatus;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setDriverStatus(DriverStatus driverStatus) {
        this.driverStatus = driverStatus;
    }

    private DriverStatus driverStatus;


    public Driver() {
        super();
    }

    public Driver(int id, int age2, String name2, Gender gender, Location location, Vehicle vehicle, DriverStatus driverStatus,int no_of_rides) {
        super(id, age2, name2, gender, location);
        this.vehicle = vehicle;
        this.driverStatus = driverStatus;
		this.no_of_rides=no_of_rides;
        // TODO Auto-generated constructor stub
    }


}

