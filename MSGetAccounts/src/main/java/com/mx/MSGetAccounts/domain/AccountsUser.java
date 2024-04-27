package com.mx.MSGetAccounts.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cuentas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AccountsUser {
	
	@Id
	@Column(name = "id_cuenta", columnDefinition = "NUMBER", nullable = false)
	int idCuenta;
	
	@Column(name = "id_usuario", columnDefinition = "NUMBER", nullable = false)
	int idUsuario;
	
	@Column(name = "tipo_cuenta", columnDefinition = "VARCHAR2(50)", nullable = false)
	String tipoCuenta;
	
	@Column(name = "saldo", columnDefinition = "NUMBER", nullable = false)
	int saldo;
	

}
