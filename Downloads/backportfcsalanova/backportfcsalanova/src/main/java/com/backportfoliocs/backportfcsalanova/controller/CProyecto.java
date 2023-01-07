package com.backportfoliocs.backportfcsalanova.controller;

import com.backportfoliocs.backportfcsalanova.model.Proyecto;
import com.backportfoliocs.backportfcsalanova.service.SProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
       @Autowired
    SProyecto proyecServ;
    
/////////////////  Para ver todos los proyectos ///////////////////
    @GetMapping("proyectos/ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return proyecServ.verProyectos();
    }
/////////////////  Para crear proyecto  ///////////////////
    @PostMapping("proyectos/new/proyecto")
    public String agregarProyecto(@RequestBody Proyecto proyec) {
        proyecServ.crearProyecto(proyec);
        return "El proyecto fue creado correctamente";
    }
/////////////////  Para borrar un proyecto  ///////////////////
    @DeleteMapping("proyectos/delete/proyecto/{id}")
    public String eliminarProyecto(@PathVariable Long id) {
        proyecServ.borrarProyecto(id);
        return "El proyecto fue borrado correctamente";
    }
////////////////  Para buscar un proyecto ///////////////////
    @GetMapping("proyectos/buscar/proyecto/{id}")
    public Proyecto  buscarProyecto(@PathVariable Long id){
        return proyecServ.buscarProyecto(id);
    }
/////////////////  Para editar proyecto  ///////////////////
    @PostMapping("proyectos/editar/proyecto")
    public String editarProyecto(@RequestBody Proyecto proyec) {
        proyecServ.crearProyecto(proyec);
        return "El proyecto fue editado correctamente";
    }
    
}
