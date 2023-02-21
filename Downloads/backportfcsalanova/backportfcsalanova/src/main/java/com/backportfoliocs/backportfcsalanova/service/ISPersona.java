package com.backportfoliocs.backportfcsalanova.service;

import com.backportfoliocs.backportfcsalanova.model.Persona;
import java.util.List;

public interface ISPersona {
    //metodo para traer todas las personas
    public List<Persona> verPersonas();

    //metodo para dar de alta una persona
    public void crearPersona(Persona perso);

    //metodo para borrar una persona
    public void borrarPersona(Long id);
    
    //metodo para editar persona
    public Persona editarPersona(Long id);

    //metodo para encontrar una persona
    public Persona buscarPersona(Long id);
}
