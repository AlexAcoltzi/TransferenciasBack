package com.mx.MSLogin.service;

import java.util.List;

import com.mx.MSLogin.domain.UserLogin;

public interface UserLoginService {
	
	// Método para buscar un usuario por correo electrónico y contraseña
	UserLogin findUser(UserLogin user);
	
	// Método para obtener todos los usuarios
	List<UserLogin> getAll();
}
