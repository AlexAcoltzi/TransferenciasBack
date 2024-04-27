package com.mx.MSGetAccounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.MSGetAccounts.dao.AccountsUserDao;
import com.mx.MSGetAccounts.domain.AccountsUser;

@Service
public class AccountsUserImp implements AccountsUserService {
	
	@Autowired
	AccountsUserDao accountUserDao;

	@Override
	public List<AccountsUser> getUserAccounts(int id_user) {
		return (List<AccountsUser>) accountUserDao.findByIdUsuario(id_user);
	}

}
