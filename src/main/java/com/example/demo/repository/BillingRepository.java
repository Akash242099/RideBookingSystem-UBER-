package com.example.demo.repository;

import com.example.demo.model.Location;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BillingRepository {

    HashMap<Double, Integer> hm = new HashMap<Double, Integer>();

    public void populateMap() {
        hm.put(5.0, 50);
        hm.put(10.0, 100);
        hm.put(15.0, 150);
        hm.put(20.0, 200);
        hm.put(25.0, 250);

    }

    public double calculateBill(List<Location> location) {

        populateMap();

        Location loc1 = location.get(0);
        Location loc2 = location.get(1);

        double distance = Math.sqrt(Math.pow(loc1.getX_ordinate() - loc2.getX_ordinate(), 2) + Math.pow(loc1.getY_ordinate() - loc2.getY_ordinate(), 2));

        return calculateFare(distance);
    }

    private double calculateFare(double distance) {

        if (distance < 5)
            return hm.get(5.0);
        if (distance >= 5 && distance < 10)
            return hm.get(10.0);
        if (distance >= 10 && distance < 15)
            return hm.get(15.0);
        if (distance >= 15 && distance < 20)
            return hm.get(20.0);
        if (distance >= 20 && distance <= 25)
            return hm.get(25.0);

        else return 1000.0;


    }


}
