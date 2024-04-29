package com.mx.MSGetAccounts.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.MSGetAccounts.domain.TransferAccount;
import java.util.List;

//Interfaz que extiende CrudRepository para operaciones CRUD básicas
public interface TransferAccountDao extends CrudRepository<TransferAccount, Integer> {
	
	// Método para buscar transferencias de un usuario por su identificador de usuario
	List<TransferAccount> findByIdUsuario(int idUsuario);
	

}
