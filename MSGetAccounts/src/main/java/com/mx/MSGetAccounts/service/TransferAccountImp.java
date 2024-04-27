package com.mx.MSGetAccounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.MSGetAccounts.dao.TransferAccountDao;
import com.mx.MSGetAccounts.domain.TransferAccount;

@Service
public class TransferAccountImp implements TransferAccountService {
	
	@Autowired
	TransferAccountDao accountDao;

	@Override
	public List<TransferAccount> getTransferAccounts(int idCuentaOrigen) {
		return accountDao.findByIdCuentaOrigen(idCuentaOrigen);
	}
	
	
}
