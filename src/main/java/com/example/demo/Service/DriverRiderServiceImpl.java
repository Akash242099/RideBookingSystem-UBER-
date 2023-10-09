package com.example.demo.Service;

import com.example.demo.repository.DriverRiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverRiderServiceImpl implements DriverRiderService {

    @Autowired
    DriverRiderRepository driverRiderRepository;

    @Override
    public double totalEarnings() {
        return driverRiderRepository.totalEarnings();
    }


}
