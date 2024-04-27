package com.mx.MSLogin.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserLogin {
	
	@Id
	@Column(name = "id_usuario", columnDefinition = "NUMBER", nullable = false)
	int idUsuario;
	
	@Column(name = "nombre", columnDefinition = "VARCHAR2(50)", nullable = false)
	String nombre;
	
	@Column(name = "correo", columnDefinition = "VARCHAR2(100)", nullable = false)
	String correo;
	
	@Column(name = "contraseña", columnDefinition = "VARCHAR2(100)", nullable = false)
	String contraseña;
}
