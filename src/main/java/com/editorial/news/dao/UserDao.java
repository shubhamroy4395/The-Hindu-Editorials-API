package com.editorial.news.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.editorial.news.model.Users;

@Component
public class UserDao {
	private static List<Users> users = new ArrayList<>();
	int count = 3;
	static {
		users.add(new Users(1,"Nidhi",new Date()));
		users.add(new Users(2,"Yachna",new Date()));
		users.add(new Users(3,"Unnati",new Date()));
		users.add(new Users(4,"Rashi",new Date()));
	}

	
	public List<Users> findAll(){
		return users;
	}
	
	
	public Users save(Users user) {
		if(user.getId()==null) {
			user.setId(++count);
		}
		users.add(user);
		return user;
	}
	
	public Users findOne(int id) {
		for(Users user: users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
}
