package com.ucreativa;
import com.ucreativa.repositories.InMemoryRepository;
import com.ucreativa.repositories.Repository;
import com.ucreativa.repositories.FileRepository;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;

import java.io.IOException;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException {
        List <BitacoraVacunas> BitacoraVacunas1 = new ArrayList<>();
        Persona persona1 = new Persona("Esteban", "1-1536-0687",28,true);
        Persona persona2 = new Persona("Marcela", "4-0293-1234",20,false);
        BitacoraVacunas bitacora1 = new BitacoraVacunas(persona1,"Marca1",new Date());
        BitacoraVacunas bitacora2 = new BitacoraVacunas(persona1,"Marca2",new Date());
        BitacoraVacunas bitacora3 = new BitacoraVacunas(persona2,"Marca3",new Date());
        BitacoraVacunas1.add(bitacora1);
        BitacoraVacunas1.add(bitacora2);
        BitacoraVacunas1.add(bitacora3);

        Scanner in = new Scanner (System.in);
        Repository repo = new FileRepository();

        while(true){
            String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca, print;
            Persona persona;
            System.out.println("Nombre:");
            nombre=in.nextLine();
            System.out.println("Cedula:");
            cedula=in.nextLine();
            System.out.println("Edad:");
            edad=in.nextLine();
            System.out.println("Riesgo (S/N):");
            riesgo=in.nextLine();
            System.out.println("Amigo (A) / Familiar (F):");
            isAmigo=in.nextLine();
            if(isAmigo.equals("A")){
                System.out.println("Relacion:");
                relacion=in.nextLine();
                System.out.println("Facebook:");
                facebook=in.nextLine();
                persona = new Amigo(nombre,cedula,Integer.parseInt(edad),riesgo.equals("S"),relacion, facebook);
            }
            else{
                System.out.println("Parentesco:");
                parentesco=in.nextLine();
                persona = new Familiar(nombre,cedula,Integer.parseInt(edad),riesgo.equals("S"),parentesco);
            }
            System.out.println("Vacunacion -- Marca:");
            marca=in.nextLine();
            repo.save(persona,marca,new Date());
            System.out.println("Quiere imprimir lista (S)?");
            print=in.nextLine();
            if(print.equals("S")){
                for(String item : repo.get()){
                    System.out.println(item);
                }
            }
        }
    }
}
