package com.example.demo.Service;

import com.example.demo.model.Location;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.addUser(user);
    }

  
    @Override
    public void deleteUser() {

    }

	@Override
	public User updateUser(int id , User user) {
		// TODO Auto-generated method stub
		return userRepository.updateUser(id , user);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userRepository.getUsersList();
	}

	@Override
	public User updateUserLocation(int id, Location location) {
		
		// TODO Auto-generated method stub
		return userRepository.updateUserLocation(id,location);
	}


	@Override
	public List<User> addUsers(List<User> user) {
		// TODO Auto-generated method stub
		return userRepository.addUsers(user);
	}
}