package com.mx.MSGetAccounts.service;

import java.util.List;

import com.mx.MSGetAccounts.domain.TransferAccount;

public interface TransferAccountService {
	
	//Obtiene las cuentas del usuario que conincidan con el id_usuario
	List<TransferAccount> getAllTransferAccounts(int idUsuario);
	
	// Guardar la transferencia en la base de datos
	void saveTransferAccount(TransferAccount transferAccount);

}
