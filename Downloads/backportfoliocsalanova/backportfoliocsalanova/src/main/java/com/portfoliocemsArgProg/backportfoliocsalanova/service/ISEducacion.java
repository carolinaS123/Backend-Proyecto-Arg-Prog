package com.portfoliocemsArgProg.backportfoliocsalanova.service;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Educacion;
import java.util.List;

public interface ISEducacion {
    
    //metodo para traer todos los estudios
    public List<Educacion> verEducaciones();

    //metodo para dar de alta un estudio
    public void crearEducacion(Educacion edu);

    //metodo para borrar un estudio
    public void borrarEducacion(Long id);

    //metodo para encontrar un estudio
    public Educacion buscarEducacion(Long id);
}
