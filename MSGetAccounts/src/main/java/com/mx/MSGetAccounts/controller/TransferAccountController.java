package com.mx.MSGetAccounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MSGetAccounts.domain.TransferAccount;
import com.mx.MSGetAccounts.service.TransferAccountImp;

@RequestMapping("/transfers")
@RestController
@CrossOrigin
public class TransferAccountController {
	
	@Autowired
	TransferAccountImp accountImp;
	
	@PostMapping("/getTransfers")
	ResponseEntity<?> getTransfers(@RequestBody TransferAccount transferAccount) {
		return new ResponseEntity<>(accountImp.getTransferAccounts(transferAccount.getIdCuentaOrigen()), HttpStatus.OK);
	}
	

}
