package com.mx.MSGetAccounts.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.MSGetAccounts.domain.AccountsUser;
import java.util.List;


public interface AccountsUserDao extends CrudRepository<AccountsUser, Integer> {
	
	List<AccountsUser> findByIdUsuario(int idUsuario);

}
