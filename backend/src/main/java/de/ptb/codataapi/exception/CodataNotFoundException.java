package de.ptb.codataapi.exception;

public class CodataNotFoundException extends RuntimeException{
    public CodataNotFoundException(String message){
        super(message);
    }
}
