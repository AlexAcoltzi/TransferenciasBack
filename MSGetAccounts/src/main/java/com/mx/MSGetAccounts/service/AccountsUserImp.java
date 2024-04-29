package com.mx.MSGetAccounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.MSGetAccounts.dao.AccountsUserDao;
import com.mx.MSGetAccounts.domain.AccountsUser;

@Service
public class AccountsUserImp implements AccountsUserService {
	
	// Inyección de dependencia del DAO de cuentas de usuario
	@Autowired
	AccountsUserDao accountUserDao;

	// Método para obtener las cuentas de un usuario por su ID
	@Override
	public List<AccountsUser> getUserAccounts(int id_user) {
		
		// Llamada al método del DAO para buscar las cuentas por ID de usuario
		return (List<AccountsUser>) accountUserDao.findByIdUsuario(id_user);
	}

}
