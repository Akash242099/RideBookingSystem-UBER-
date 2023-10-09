package com.example.demo.repository;

import com.example.demo.Service.DriverService;
import com.example.demo.enums.DriverStatus;
import com.example.demo.model.Driver;
import com.example.demo.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRiderRepository {


    @Autowired
    DriverService driverService;
    HashMap<Integer, Driver> hm = new HashMap<Integer, Driver>();
    List<Driver> driverList = new ArrayList<Driver>();

    public List<Driver> getAvailableRides(int id, List<Location> locations) {
        Location source = locations.get(0);
        Location destination = locations.get(1);
        int radius = 5;

       // int dist = (int) Math.sqrt(Math.pow((Math.abs(source.getX_ordinate() - destination.getX_ordinate())), 2) + Math.pow((Math.abs(source.getY_ordinate() - destination.getY_ordinate())), 2));
        driverList = getDriverunderRadius(radius, source);
        return driverList;

    }


    private ArrayList<Driver> getDriverunderRadius(int dist, Location source) {

        ArrayList<Driver> driverList = new ArrayList<Driver>();
        Driver driver_res = null;

        int min = Integer.MAX_VALUE;
        for (Driver driver : driverService.getDriverList()) {
            Location loc = driver.getLocation();
            int x = loc.getX_ordinate();
            int y = loc.getY_ordinate();

            int dist_driver = (int) Math.sqrt(Math.pow((Math.abs(loc.getX_ordinate() - source.getX_ordinate())), 2) + Math.pow((Math.abs(loc.getY_ordinate() - source.getY_ordinate())), 2));

            if (dist_driver <= dist && driver.getDriverStatus() == DriverStatus.available) {
                if (dist_driver < min) {
                    driver_res = driver;
                    min = dist_driver;
                }
                driverList.add(driver);

            }

        }
        hm.put(min, driver_res);
        return driverList;
    }

    public Driver chooseAvailableRides() {
        Driver driver = null;

        for (Map.Entry<Integer, Driver> mentry : hm.entrySet()) {
            driver = mentry.getValue();
        }

        return driver;

    }
}
