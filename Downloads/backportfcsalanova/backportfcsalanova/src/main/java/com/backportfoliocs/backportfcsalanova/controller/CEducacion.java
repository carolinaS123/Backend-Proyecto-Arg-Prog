package com.backportfoliocs.backportfcsalanova.controller;

import com.backportfoliocs.backportfcsalanova.dto.EducacionDto;
import com.backportfoliocs.backportfcsalanova.model.Educacion;
import com.backportfoliocs.backportfcsalanova.service.SEducacion;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("educaciones")
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    @Autowired
    private SEducacion educServ;

/////////////////  Para ver todos los estudios ///////////////////
    @GetMapping("/mostrar")
    public List<Educacion> mostrarEducaciones() {
        return educServ.mostrarEducaciones();
    }
/////////////////  Para crear un estudio  ///////////////////
    @PostMapping("/crear")
    public String crearEducacion(@RequestBody Educacion edu) {
        educServ.crearEducacion(edu);
        return "El estudio fue creado correctamente";
    }
/////////////////  Para borrar un estudio  ///////////////////
    @DeleteMapping("/borrar/{id}")
    public String borrarEducacion(@PathVariable Long id) {
        educServ.borrarEducacion(id);
        return "El estudio fue borrado correctamente";
    }
////////////////  Para buscar un estudio  ///////////////////
    @GetMapping("/buscar/{id}")
    public Educacion buscarEducacion(@PathVariable Long id) {
        return educServ.buscarEducacion(id);
    }
 /////////////////  Para editar un estudio  ///////////////////
 @PutMapping("/editar/{id}")
 public Educacion editarEducacion(@PathVariable("id") Long id,  @RequestBody EducacionDto eduDto)
   {
       Educacion edu = educServ.buscarEducacion(id);
        edu.setInstitucion(eduDto.getInstitucion());
        edu.setTitulacion(eduDto.getTitulacion());
        edu.setInicio_edu(eduDto.getInicio_edu());
        edu.setFin_edu(eduDto.getFin_edu());
        edu.setDescripcion_edu(eduDto.getDescripcion_edu());
        educServ.crearEducacion(edu);
        return edu;
   }        

}
