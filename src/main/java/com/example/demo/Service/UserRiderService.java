package com.example.demo.Service;

import com.example.demo.model.Driver;
import com.example.demo.model.Location;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserRiderService {

    public List<Driver> getAvailableRides(int id, List<Location> locations);

    Driver chooseAvailableRides();
}
