package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FileRepository implements Repository{

    @Override
    public void save(Persona persona, String marca, Date fecha){
        File archivo = new File("FileRepository.txt");
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        BufferedWriter bw;

        try {
            bw = new BufferedWriter(new FileWriter(archivo));

            if (archivo.exists()) {
                bw.append(persona.getNombre() + " - " + marca + " - " + format.format(fecha) + "\n");
            } else {
                bw.write(persona.getNombre() + " - " + marca + " - " + format.format(fecha) + "\n");
            }
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<String> get(){
        return null;
    }
}
