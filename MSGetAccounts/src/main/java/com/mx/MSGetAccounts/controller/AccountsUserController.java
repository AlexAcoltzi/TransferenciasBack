package com.mx.MSGetAccounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MSGetAccounts.domain.AccountsUser;
import com.mx.MSGetAccounts.service.AccountsUserImp;

@RequestMapping("/Accounts")
@RestController
@CrossOrigin
public class AccountsUserController {
	
	@Autowired
	AccountsUserImp accountsUserImp;
	
	@PostMapping("/getAccounts")
	ResponseEntity<?> getAccounts(@RequestBody AccountsUser accountsUser){
		return new ResponseEntity<>(accountsUserImp.getUserAccounts(accountsUser.getIdUsuario()), HttpStatus.OK);
		
	}
}
