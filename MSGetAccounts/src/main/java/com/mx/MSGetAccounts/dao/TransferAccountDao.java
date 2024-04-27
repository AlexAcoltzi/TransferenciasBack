package com.mx.MSGetAccounts.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.MSGetAccounts.domain.TransferAccount;
import java.util.List;


public interface TransferAccountDao extends CrudRepository<TransferAccount, Integer> {
	
	List<TransferAccount> findByIdCuentaOrigen(int idCuentaOrigen);

}
