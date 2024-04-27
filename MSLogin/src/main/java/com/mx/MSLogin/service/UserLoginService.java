package com.mx.MSLogin.service;

import java.util.List;

import com.mx.MSLogin.domain.UserLogin;

public interface UserLoginService {
	
	UserLogin findUser(UserLogin user);
	
	List<UserLogin> getAll();
}
