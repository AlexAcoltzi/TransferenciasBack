package com.mx.MSGetAccounts.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Anotación para indicar que esta clase es una entidad persistente
@Entity
//Especificación del nombre de la tabla en la base de datos
@Table(name = "cuentas")
//Lombok: genera getters para acceder a los atributos de la entidad
@Getter
//Lombok: genera un constructor sin argumentos
@NoArgsConstructor
//Lombok: genera un constructor con todos los argumentos
@AllArgsConstructor
public class AccountsUser {
	
	// Identificador de la cuenta (clave primaria)
	@Id
	@Column(name = "id_cuenta", columnDefinition = "NUMBER", nullable = false)
	private int idCuenta;
	
	// Identificador del usuario al que pertenece la cuenta
	@Column(name = "id_usuario", columnDefinition = "NUMBER", nullable = false)
	private int idUsuario;
	
	// Tipo de cuenta (ejemplo: cuenta de ahorros, cuenta corriente, etc.)
	@Column(name = "tipo_cuenta", columnDefinition = "VARCHAR2(50)", nullable = false)
	private String tipoCuenta;
	
	// Saldo de la cuenta
	@Column(name = "saldo", columnDefinition = "NUMBER", nullable = false)
	// Lombok: genera el método setter para esta propiedad
	@Setter
	private Double saldo;
	

}
