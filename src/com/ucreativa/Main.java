package com.ucreativa;
import com.ucreativa.familia.Esteban;
import com.ucreativa.familia.Marina;
import com.ucreativa.vacunacion.BitacoraVacunas;
import com.ucreativa.vacunacion.Persona;
import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        Esteban esteban1 = new Esteban("Buenas noches x2");
        Marina marina1 = new Marina("Buenas noches");
        ArrayList BitacoraVacunas1 = new ArrayList();
        Persona persona1 = new Persona("Esteban", "1-1536-0687",28,true);
        Persona persona2 = new Persona("Marcela", "4-0293-1234",20,false);
        BitacoraVacunas bitacora1 = new BitacoraVacunas(persona1,"Marca1",new Date());
        BitacoraVacunas bitacora2 = new BitacoraVacunas(persona1,"Marca2",new Date());
        BitacoraVacunas bitacora3 = new BitacoraVacunas(persona2,"Marca3",new Date());
        BitacoraVacunas1.add(bitacora1);
        BitacoraVacunas1.add(bitacora2);
        BitacoraVacunas1.add(bitacora3);
    }
}
