package com.mx.MSGetAccounts.service;

import java.util.List;

import com.mx.MSGetAccounts.domain.TransferAccount;

public interface TransferAccountService {
	
	List<TransferAccount> getTransferAccounts(int idCuentaOrigen);

}
