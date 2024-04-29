package com.mx.MSGetAccounts.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.MSGetAccounts.domain.AccountsUser;
import java.util.List;


//Interfaz que extiende CrudRepository para operaciones CRUD básicas
public interface AccountsUserDao extends CrudRepository<AccountsUser, Integer> {
	
	// Método para buscar cuentas de usuario por su identificador de usuario
	List<AccountsUser> findByIdUsuario(int idUsuario);
	
	// Método para buscar cuentas de usuario por su identificador de cuenta
	List<AccountsUser> findByIdCuenta(int idCuenta);

}
