package com.ucreativa.ui;

public class ErrorEnEdadException extends Exception{

    public ErrorEnEdadException(String edad){
        super("Edad incorrecta: "+ edad);
    }
}
