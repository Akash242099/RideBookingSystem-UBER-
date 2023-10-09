package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Driver;
import com.example.demo.model.Location;
import com.example.demo.model.User;

public interface UserService {

    public User addUser(User user);

    public void deleteUser();

	public User updateUser(int id, User user);

	public List<User> getUserList();

	public User updateUserLocation(int id, Location location);

	public List<User> addUsers(List<User> user);


}