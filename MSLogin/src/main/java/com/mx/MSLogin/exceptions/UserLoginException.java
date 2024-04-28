package com.mx.MSLogin.exceptions;

public class UserLoginException extends RuntimeException {
    public UserLoginException(String mensaje){
        super(mensaje);
    }
}
