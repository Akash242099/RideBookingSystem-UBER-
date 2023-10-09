package com.example.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Location;
import com.example.demo.enums.DriverStatus;
import com.example.demo.model.Driver;

@Repository
public class DriverRepository {

	List<Driver> driverList = new ArrayList<Driver>();

	HashMap<Integer, Driver> driverMap = new HashMap<Integer, Driver>();

	public Driver addDriver(Driver driver) {

		if (!driverMap.containsKey(getDriverId(driver))) {
			driverMap.put(getDriverId(driver), driver);
			driverList.add(driverMap.get(getDriverId(driver)));

		}
		return driverMap.get(getDriverId(driver));
	}

	private int getDriverId(Driver driver) {
		// TODO Auto-generated method stub
		return driver.getId();
	}

	private void printDriverList(List<Driver> driverList) {
		for (Driver driver : driverList) {
			System.out.println("USER : " + driver);
		}
	}

	public void updateDriverLocation() {

	}

	public void deleteDriver() {

	}

	public Driver updateDriver(int id, Driver driver) {
		// TODO Auto-generated method stub
		if (driverMap.containsKey(id)) {
			driverList.remove(driverMap.get(id));
			driverMap.put(id, driver);

			driverList.add(driver);
			return driverMap.get(id);
		}
		return driver;
	}

	public List<Driver> getDriversList() {
		// TODO Auto-generated method stub

		return driverList;
	}

	public Driver updateDriverLocation(int id, Location location) {
		// TODO Auto-generated method stub
		Driver driver = getDriverById(id);
		driver.setLocation(location);
		return driver;
	}

	private Driver getDriverById(int id) {
		// TODO Auto-generated method stub
		return driverMap.get(id);

	}

	public List<Driver> addDrivers(List<Driver> drivers) {
		// TODO Auto-generated method stub

		for (Driver driver : drivers) {
			addDriver(driver);
		}

		return driverList;
	}

	public Driver updateDriverDetails(int id, Map<Object, Object> driverMap2) {
		// TODO Auto-generated method stub
		Driver driver = driverMap.get(id);

		if (driver != null) {
			driverList.remove(driverMap.remove(driver));
		}

		for (Map.Entry<Object, Object> mentry : driverMap2.entrySet()) {
			// mentry.getKey();
			if (mentry.getKey().equals("age")) {
				int obj = (int) mentry.getValue();
				driver.setAge(obj);

			}
			if (mentry.getKey().equals("name")) {
				String name = (String) mentry.getValue();
				driver.setName(name);

			}
			driverList.add(driver);
		}

		return driver;

	}

	public Driver updateDriverStatus(int id, DriverStatus driverStatus) {
		// TODO Auto-generated method stub
		Driver driver = driverMap.get(id);
		if (driver != null) {
			driverList.remove(driverMap.remove(driver));
		}
		
		driver.setDriverStatus(driverStatus);
		return driver;
		
	
		
 
	}
}
