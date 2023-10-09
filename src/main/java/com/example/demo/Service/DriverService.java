package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import com.example.demo.enums.DriverStatus;
import com.example.demo.model.Driver;
import com.example.demo.model.Location;

public interface DriverService {

	    public Driver addDriver(Driver driver);

	    public void deleteDriver();

		public Driver updateDriver(int id, Driver driver);

		public List<Driver> getDriverList();

		public Driver updateDriverLocation(int id, Location location);

		public Driver updateDriverDetails(int id, Map<Object, Object> driverMap);


		public Driver updateDriverStatus(int id, DriverStatus driverStatus);

		//public List<Driver> addDriver(List<Driver> driver);
}
