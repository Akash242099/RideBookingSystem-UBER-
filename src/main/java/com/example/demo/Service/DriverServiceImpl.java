package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enums.DriverStatus;
import com.example.demo.model.Driver;
import com.example.demo.model.Location;
import com.example.demo.repository.DriverRepository;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverRepository driverRepository;

	@Override
	public Driver addDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverRepository.addDriver(driver);
	}

	@Override
	public void deleteDriver() {
		// TODO Auto-generated method stub
		driverRepository.deleteDriver();
	}

//	@Override
//	public Driver updateDriver(int id, Driver driver) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Driver> getDriverList() {
		// TODO Auto-generated method stub
		return driverRepository.getDriversList();
	}

	@Override
	public Driver updateDriverLocation(int id, Location location) {
		// TODO Auto-generated method stub
		return driverRepository.updateDriverLocation(id, location);
	}

//	@Override
//	public List<Driver> addDriver(List<Driver> driver) {
//		// TODO Auto-generated method stub
//		return driverRepository.addDriver(driver);
//	}

	@Override
	public Driver updateDriver(int id, Driver driver) {
		// TODO Auto-generated method stub
		return driverRepository.updateDriver(id, driver);
	}

	@Override
	public Driver updateDriverDetails(int id, Map<Object, Object> driverMap) {
		// TODO Auto-generated method stub
		return driverRepository.updateDriverDetails(id,driverMap);
	}

	@Override
	public Driver updateDriverStatus(int id, DriverStatus driverStatus) {
		// TODO Auto-generated method stub
		return driverRepository.updateDriverStatus(id,driverStatus);
	}

	
	
}
