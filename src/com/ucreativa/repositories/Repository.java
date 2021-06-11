package com.ucreativa.repositories;

import java.io.IOException;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.ucreativa.vacunacion.entities.Persona;

public interface Repository {
    void save(Persona persona, String marca, Date fecha) throws IOException;
    List<String> get();
}