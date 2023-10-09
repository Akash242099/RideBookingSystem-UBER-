package com.example.demo.controller;

import com.example.demo.Service.BillingService;
import com.example.demo.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    BillingService billingService;


    @GetMapping("/calculate-bill")
    public double calculateBill(@RequestBody List<Location> locations) {
        return billingService.calculateBill(locations);
    }

}
