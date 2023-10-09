package com.example.demo.repository;

import com.example.demo.model.Location;
import com.example.demo.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {


    List<User> userList = new ArrayList<User>();

	HashMap<Integer,User> userMap = new HashMap<Integer,User>();
	
    public User addUser(User user) {
    	
       if(!userMap.containsKey(getUserId(user))) {
    	   userMap.put(getUserId(user), user);
    	   userList.add(userMap.get(getUserId(user)));
    	   
       }
       return userMap.get(getUserId(user));
    }

//    private List<User> getUserList(HashMap<Integer,User> userMap) {
//		// TODO Auto-generated method stub
//    	for(Map.Entry<Integer, User> mentry : userMap.entrySet()) {
//   
//    		User user = mentry.getValue();
//    		userList.add(user);
//    		
//    	}
//		return userList;
//	}

	private int getUserId(User user) {
		// TODO Auto-generated method stub
    	return user.getId();
	}

	private void printUserList(List<User> userList) {
        for (User user : userList) {
            System.out.println("USER : " + user);
        }
    }

    public void updateUserLocation() {

    }


    public void deleteUser() {

    }

	public User updateUser(int id ,  User user) {
		// TODO Auto-generated method stub
		if(userMap.containsKey(id)) {
			userList.remove(userMap.get(id));
			userMap.put(id, user);
			
			userList.add(user);
			return userMap.get(id);
		}
		return user;
	}

	public List<User> getUsersList() {
		// TODO Auto-generated method stub
		
		return userList;
	}

	public User updateUserLocation(int id, Location location) {
		// TODO Auto-generated method stub
		User user = getUserById(id);
		user.setLocation(location);
		return user;
	}

	private User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMap.get(id);
		
	}

	public List<User> addUsers(List<User> users) {
		// TODO Auto-generated method stub
		
		for(User user:users) {
			addUser(user);
		}
		
		return userList;
	}

}
