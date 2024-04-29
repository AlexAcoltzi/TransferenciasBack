package com.mx.MSLogin.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.MSLogin.domain.UserLogin;

//Interfaz para acceder a los datos de los usuarios en la base de datos
public interface UserLoginDao extends CrudRepository<UserLogin, Integer> {
	
	// Método para buscar un usuario por su correo electrónico
	UserLogin findByCorreo(String correo);

}
