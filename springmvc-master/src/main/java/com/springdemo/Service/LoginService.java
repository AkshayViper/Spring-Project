package com.springdemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.Dao.LoginDao;

@Service
public class LoginService {
	@Autowired
	public LoginDao loginDao;
	public String getLogin()
	{
		return loginDao.getLogin();
	}

}
