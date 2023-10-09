package com.example.demo.Service;

import com.example.demo.model.Driver;
import com.example.demo.model.Location;
import com.example.demo.repository.UserRiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRiderServiceImpl implements UserRiderService {

    @Autowired
    UserRiderRepository userRiderRepository;

    @Override
    public List<Driver> getAvailableRides(int id, List<Location> locations) {

        return userRiderRepository.getAvailableRides(id, locations);


    }

    @Override
    public Driver chooseAvailableRides() {
        return userRiderRepository.chooseAvailableRides();
    }
}
