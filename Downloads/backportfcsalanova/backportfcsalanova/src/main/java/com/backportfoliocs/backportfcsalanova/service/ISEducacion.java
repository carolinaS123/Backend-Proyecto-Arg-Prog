package com.backportfoliocs.backportfcsalanova.service;

import com.backportfoliocs.backportfcsalanova.model.Educacion;
import java.util.List;

public interface ISEducacion {
   //metodo para traer todos los estudios
    public List<Educacion> mostrarEducaciones();

    //metodo para dar de alta un estudio
    public void crearEducacion(Educacion edu);

    //metodo para borrar un estudio
    public void borrarEducacion(Long id);
    
    //metodo para editar un  estudio
    public Educacion editarEducacion(Long id);

    //metodo para encontrar un estudio
    public Educacion buscarEducacion(Long id);
}
