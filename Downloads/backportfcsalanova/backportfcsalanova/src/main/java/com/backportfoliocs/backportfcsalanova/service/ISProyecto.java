package com.backportfoliocs.backportfcsalanova.service;

import com.backportfoliocs.backportfcsalanova.model.Proyecto;
import java.util.List;

public interface ISProyecto {
    //metodo para traer todos los proyectos
    public List<Proyecto> mostrarProyectos();

    //metodo para dar de alta un proyecto
    public void crearProyecto(Proyecto proyec);

    //metodo para borrar un proyecto
    public void borrarProyecto(Long id);
    
   //metodo para editar un proyecto
    public Proyecto editarProyecto(Long id);

    //metodo para encontrar un proyecto
    public Proyecto buscarProyecto(Long id);
}
