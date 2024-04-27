package com.mx.MSLogin.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.MSLogin.domain.UserLogin;

public interface UserLoginDao extends CrudRepository<UserLogin, Integer> {
	
	UserLogin findByNombre(String nombre);

}
