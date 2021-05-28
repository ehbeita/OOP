package com.ucreativa.vacunacion;

public class Persona {

    public String nombre;
    public String cedula;
    private int edad;
    private Boolean riesgo;

    public Persona(String nombre, String cedula, int edad, Boolean riesgo){
        this.nombre=nombre;
        this.cedula=cedula;
        this.edad=edad;
        this.riesgo=riesgo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getCedula(){
        return this.cedula;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public Boolean getRiesgo(){
        return this.riesgo;
    }

    public void setRiesgo(Boolean riesgo){
        this.riesgo=riesgo;
    }


}
