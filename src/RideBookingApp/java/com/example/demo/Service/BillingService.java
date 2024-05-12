package com.example.demo.Service;

import com.example.demo.model.Location;

import java.util.List;

public interface BillingService {

    public double calculateBill(List<Location> location);
}
