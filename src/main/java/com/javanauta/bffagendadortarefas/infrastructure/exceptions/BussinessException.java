package com.javanauta.bffagendadortarefas.infrastructure.exceptions;


public class BussinessException extends RuntimeException {

    public BussinessException(String mensagem){
        super(mensagem);
    }

    public BussinessException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
