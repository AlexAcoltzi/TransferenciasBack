package com.mx.MSGetAccounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.MSGetAccounts.dao.AccountsUserDao;
import com.mx.MSGetAccounts.dao.TransferAccountDao;
import com.mx.MSGetAccounts.domain.AccountsUser;
import com.mx.MSGetAccounts.domain.TransferAccount;

@Service
public class TransferAccountImp implements TransferAccountService {
	
	// Inyección de dependencia del DAO de transferencias del usuario
	@Autowired
	TransferAccountDao transferAccountDao;
	// Inyección de dependencia del DAO de cuentas de usuario
	@Autowired
	AccountsUserDao accountsUserDao; 
	

	@Override
	public List<TransferAccount> getAllTransferAccounts(int idUsuario) {
		//Obtiene las cuentas del usuario que conincidan con el id_usuario
		return transferAccountDao.findByIdUsuario(idUsuario);
	}

	@Override
	public void saveTransferAccount(TransferAccount transferAccount) {
		// Guardar la transferencia en la base de datos
		transferAccountDao.save(transferAccount);
		
		// Actualizar el saldo de la cuenta de origen
		AccountsUser user = accountsUserDao.findByIdCuenta(transferAccount.getIdCuentaOrigen()).get(0);
		user.setSaldo(user.getSaldo() - transferAccount.getMonto());
		accountsUserDao.save(user);
	}
	
}
