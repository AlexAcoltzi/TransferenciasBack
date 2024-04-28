package com.mx.MSLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@Autowired
	UserLoginImp userImp;

	@PostMapping("/login-user")
	ResponseEntity<?> getLogin(@RequestBody UserLogin user) {
		try {
			return new ResponseEntity<>(userImp.findUser(user), HttpStatus.OK);
		} catch (UserLoginExceptionNotFound e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		} catch (UserLoginException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/getAll")
	ResponseEntity<?> getAll() {
		return new ResponseEntity<>(userImp.getAll(), HttpStatus.OK);
	}
	
}
