package com.springdemo.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {
	
	public String getLogin()
	{
		return "You have loggedin Successfully Boss";
	}

}
