package com.ucreativa.vacunacion.entities;

import com.ucreativa.vacunacion.services.ContadorRiesgo;

public class Persona {

    private String nombre;
    private String cedula;
    private int edad;
    private Boolean riesgo;

    public Persona(String nombre, String cedula, int edad, Boolean riesgo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.riesgo = riesgo;
        if (riesgo) {
            ContadorRiesgo.getInstance().SumarRiesgo();
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCedula() {
        return this.cedula;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getRiesgo() {
        return this.riesgo;
    }

    public void setRiesgo(Boolean riesgo) {
        this.riesgo = riesgo;
    }

}
