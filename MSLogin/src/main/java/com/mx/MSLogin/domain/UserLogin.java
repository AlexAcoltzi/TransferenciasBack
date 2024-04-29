package com.mx.MSLogin.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Anotación para indicar que esta clase es una entidad persistente
@Entity
//Especificación del nombre de la tabla en la base de datos
@Table(name = "usuarios")
//Lombok: genera getters para acceder a los atributos de la entidad
@Getter
//Lombok: genera un constructor sin argumentos
@NoArgsConstructor
//Lombok: genera un constructor con todos los argumentos
@AllArgsConstructor
public class UserLogin {
	
	// Identificador único del usuario
	@Id
	@Column(name = "id_usuario", columnDefinition = "NUMBER", nullable = false)
	private int idUsuario;
	
	// Nombre del usuario
	@Column(name = "nombre", columnDefinition = "VARCHAR2(50)", nullable = false)
	private String nombre;
	
	// Correo electrónico del usuario / nombre de usuario
	@Column(name = "correo", columnDefinition = "VARCHAR2(100)", nullable = false)
	private String correo;
	
	 // Contraseña del usuario.
	@Column(name = "contraseña", columnDefinition = "VARCHAR2(100)", nullable = false)
	private String contraseña;
}
