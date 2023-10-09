package com.example.demo.Service;

import com.example.demo.model.Location;
import com.example.demo.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingServiceImpl implements BillingService {

    @Autowired
    BillingRepository billingRepository;

    @Override
    public double calculateBill(List<Location> location) {


       return billingRepository.calculateBill(location);

       
    }
}
