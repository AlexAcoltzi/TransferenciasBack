package com.mx.MSGetAccounts.service;

import java.util.List;

import com.mx.MSGetAccounts.domain.AccountsUser;

public interface AccountsUserService {
	
	// Método para obtener las cuentas de un usuario por su ID
	List<AccountsUser> getUserAccounts(int id_user);

}
