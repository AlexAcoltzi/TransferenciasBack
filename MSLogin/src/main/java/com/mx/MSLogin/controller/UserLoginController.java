package com.mx.MSLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MSLogin.domain.UserLogin;
import com.mx.MSLogin.exceptions.UserLoginException;
import com.mx.MSLogin.exceptions.UserLoginExceptionNotFound;
import com.mx.MSLogin.service.UserLoginImp;

@RequestMapping("/loginRedSinergia")
@RestController
@CrossOrigin
public class UserLoginController {
	
	//Se inyecta la dependencia
	@Autowired
	UserLoginImp userImp;

	//Endpoint para buscar un usuario
	@PostMapping("/login-user")
	ResponseEntity<?> getLogin(@RequestBody UserLogin user) {
		try {
			// Intentar encontrar al usuario y devolver la respuesta adecuada
			return new ResponseEntity<>(userImp.findUser(user), HttpStatus.OK);
		} catch (UserLoginExceptionNotFound e) {
			 // Capturar excepción si el usuario no se encuentra y devolver un error 404
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		} catch (UserLoginException e) {
			// Capturar excepción si hay un error de autenticación y devolver un error 401
			return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
		} catch (Exception e) {
			// Capturar excepciones generales y devolver un error 500
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
