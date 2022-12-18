package com.portfoliocemsArgProg.backportfoliocsalanova.service;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Proyecto;
import java.util.List;

public interface ISProyecto {
    
    //metodo para traer todos los proyectos
    public List<Proyecto> verProyectos();

    //metodo para dar de alta un proyecto
    public void crearProyecto(Proyecto proyec);

    //metodo para borrar un proyecto
    public void borrarProyecto(Long id);

    //metodo para encontrar un proyecto
    public Proyecto buscarProyecto(Long id);
}
