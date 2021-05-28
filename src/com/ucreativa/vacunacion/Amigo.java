package com.ucreativa.vacunacion;

public class Amigo extends Persona{

    private String relacion;
    private String facebook;

    public Amigo(String nombre, String cedula, int edad, Boolean riesgo, String relacion, String facebook){
        super(nombre,cedula,edad,riesgo);
        this.relacion=relacion;
        this.facebook=facebook;
    }

    public String getRelacion(){
        return this.relacion;
    }

    public String getFacebook(){
        return this.facebook;
    }

}
