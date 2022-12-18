package com.portfoliocemsArgProg.backportfoliocsalanova.service;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Experiencia;
import java.util.List;

public interface ISExperiencia {
    
    //metodo para traer todas las experiencias
    public List<Experiencia> verExperiencias();

    //metodo para dar de alta una experiencia
    public void crearExperiencia(Experiencia expe);

    //metodo para borrar una experiencia
    public void borrarExperiencia(Long id);

    //metodo para encontrar una experiencia
    public Experiencia buscarExperiencia(Long id);
}
