package com.mx.MSLogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.MSLogin.dao.UserLoginDao;
import com.mx.MSLogin.domain.UserLogin;

@Service
public class UserLoginImp implements UserLoginService {

	@Autowired
	UserLoginDao userLoginDao;
	
	@Override
	public UserLogin findUser(UserLogin user) {
		return userLoginDao.findByNombre(user.getNombre());
	}

	@Override
	public List<UserLogin> getAll() {
		return (List<UserLogin>) userLoginDao.findAll();
	}

}
