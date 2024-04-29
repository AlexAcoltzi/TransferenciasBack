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
	
	// Endpoint para obtener todas las transferencias de un usuario
	@PostMapping("/getTransfers")
	ResponseEntity<?> getTransfers(@RequestBody TransferAccount transferAccount) {
		// Llama al servicio para obtener todas las transferencias de un usuario y devuelve una respuesta HTTP OK con los datos
		return new ResponseEntity<>(accountImp.getAllTransferAccounts(transferAccount.getIdUsuario()), HttpStatus.OK);
	}
	
	// Endpoint para guardar una nueva transferencia
	@PostMapping("/setTransfers")
	ResponseEntity<?> setTransfers(@RequestBody TransferAccount transferAccount) {
		// Llama al servicio para guardar la transferencia y devuelve una respuesta HTTP con estado de creación exitosa
		accountImp.saveTransferAccount(transferAccount);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
