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

	// Inyercción de la dependencia UserLoginDao
	@Autowired
	UserLoginDao userLoginDao;
	
	// Método para buscar un usuario por correo electrónico y contraseña
	@Override
	public UserLogin findUser(UserLogin user) {
		// Busca un usuario en la base de datos por su correo electrónico
		UserLogin userToFind = userLoginDao.findByCorreo(user.getCorreo());

		// Si no se encuentra ningún usuario con el correo proporcionado, lanza una excepción
		if (userToFind == null ) {
			throw new UserLoginExceptionNotFound("Usuario no encontrado"); 
		} else if (!userToFind.getContraseña().equals(user.getContraseña())) {
			// Si se encuentra un usuario pero la contraseña no coincide, lanza una excepción
			throw new UserLoginException("Contraseña incorrecta");
		} 

		// Devuelve el usuario encontrado si todo está correcto
		return userToFind;
	}

	// Método para obtener todos los usuarios
	@Override
	public List<UserLogin> getAll() {
		// Utiliza el método findAll() del repositorio para obtener todos los usuarios de la base de datos
		return (List<UserLogin>) userLoginDao.findAll();
	}

}
