package com.mx.MSGetAccounts.service;

import java.util.List;

import com.mx.MSGetAccounts.domain.AccountsUser;

public interface AccountsUserService {
	
	List<AccountsUser> getUserAccounts(int id_user);

}
