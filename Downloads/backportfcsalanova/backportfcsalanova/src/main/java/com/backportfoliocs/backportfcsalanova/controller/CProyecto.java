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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proyectos")
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
       @Autowired
    SProyecto proyecServ;
    
/////////////////  Para ver todos los proyectos ///////////////////
    @GetMapping("/mostrar")
    @ResponseBody
    public List<Proyecto> mostrarProyectos() {
        return proyecServ.mostrarProyectos();
    }
/////////////////  Para crear proyecto  ///////////////////
    @PostMapping("/crear")
    public String crearProyecto(@RequestBody Proyecto proyec) {
        proyecServ.crearProyecto(proyec);
        return "El proyecto fue creado correctamente";
    }
/////////////////  Para borrar un proyecto  ///////////////////
    @DeleteMapping("/borrar/{id}")
    public String borrarProyecto(@PathVariable Long id) {
        proyecServ.borrarProyecto(id);
        return "El proyecto fue borrado correctamente";
    }
////////////////  Para buscar un proyecto ///////////////////
    @GetMapping("/buscar/{id}")
    public Proyecto  buscarProyecto(@PathVariable Long id){
        return proyecServ.buscarProyecto(id);
    }
/////////////////  Para editar un proyecto  ///////////////////
    @PutMapping("/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
            @RequestParam("nombre_proy") String nuevoNombre_proy,
            @RequestParam("descripcion_proy") String nuevaDescripcion_proy,
            @RequestParam("inicio_proy") String nuevoInicio_proy,
            @RequestParam("fin_proy") String nuevoFin_proy,
            @RequestParam("imagen_proy") String nuevaImagen_proy,
            @RequestParam("link_proy") String nuevoLink_proy,
           @RequestParam("personaId") Long nuevaPersonaId ) {

//se busca el proyecto
        Proyecto proyec = proyecServ.buscarProyecto(id);
        proyec.setNombre_proy(nuevoNombre_proy);
        proyec.setDescripcion_proy(nuevaDescripcion_proy);
        proyec.setInicio_proy(nuevoInicio_proy);
        proyec.setFin_proy(nuevoFin_proy);
        proyec.setImagen_proy(nuevaImagen_proy);
        proyec.setLink_proy(nuevoLink_proy);
        proyec.setPersonaId(nuevaPersonaId);
        proyecServ.crearProyecto(proyec);
        //retorna la nuevo proyecto
        return proyec;
    }
    
}
