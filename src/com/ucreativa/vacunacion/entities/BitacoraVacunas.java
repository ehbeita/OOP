package com.ucreativa.vacunacion.entities;

import java.util.Date;

public class BitacoraVacunas{

    private Persona persona;
    private String marca;
    private Date fecha;

    public BitacoraVacunas(Persona persona, String marca, Date fecha){
        this.persona=persona;
        this.marca=marca;
        this.fecha=fecha;
    }

    public Persona getPersona(){
        return this.persona;
    }

    public String getMarca(){
        return this.marca;
    }

    public Date getFecha(){
        return this.fecha;
    }
}