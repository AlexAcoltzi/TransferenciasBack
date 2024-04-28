package com.mx.MSLogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.MSLogin.dao.UserLoginDao;
import com.mx.MSLogin.domain.UserLogin;
import com.mx.MSLogin.exceptions.UserLoginException;
import com.mx.MSLogin.exceptions.UserLoginExceptionNotFound;

@Service
public class UserLoginImp implements UserLoginService {

	@Autowired
	UserLoginDao userLoginDao;
	
	@Override
	public UserLogin findUser(UserLogin user) {
		UserLogin userToFind = userLoginDao.findByNombre(user.getNombre());

		if (userToFind == null ) {
			throw new UserLoginExceptionNotFound("Usuario no encontrado"); 
		} else if (!userToFind.getContraseña().equals(user.getContraseña())) {
			throw new UserLoginException("Contraseña incorrecta");
		} 

		return userToFind;
	}

	@Override
	public List<UserLogin> getAll() {
		return (List<UserLogin>) userLoginDao.findAll();
	}

}
