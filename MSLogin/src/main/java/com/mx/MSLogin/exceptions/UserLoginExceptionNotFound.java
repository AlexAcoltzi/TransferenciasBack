package com.mx.MSLogin.exceptions;

//Clase que representa una excepción personalizada para manejar errores de inicio de sesión de usuarios
public class UserLoginExceptionNotFound extends RuntimeException {
    /**
	 * 
	 */
	// SerialVersionUID para control de versiones de la clase
	private static final long serialVersionUID = 1L;

	// Constructor que recibe un mensaje de error
	public UserLoginExceptionNotFound(String mensaje){
		// Llama al constructor de la clase base (RuntimeException) con el mensaje proporcionado
        super(mensaje);
    }
}
