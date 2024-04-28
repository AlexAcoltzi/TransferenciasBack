package com.mx.MSLogin.exceptions;

public class UserLoginExceptionNotFound extends RuntimeException {
    public UserLoginExceptionNotFound(String mensaje){
        super(mensaje);
    }
}
