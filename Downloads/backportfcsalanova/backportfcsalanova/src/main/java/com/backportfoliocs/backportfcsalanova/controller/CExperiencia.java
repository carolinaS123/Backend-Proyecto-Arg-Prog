package com.backportfoliocs.backportfcsalanova.controller;

import com.backportfoliocs.backportfcsalanova.dto.ExperienciaDto;
import com.backportfoliocs.backportfcsalanova.model.Experiencia;
import com.backportfoliocs.backportfcsalanova.service.SExperiencia;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experiencias")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    @Autowired
    SExperiencia expeServ;
    
   /////////////////  Para ver todas las experiencias ///////////////////
    @GetMapping("/mostrar")
    @ResponseBody
    public List<Experiencia> mostrarExperiencias() {
        return expeServ.mostrarExperiencias();
    }
/////////////////  Para crear experiencia  ///////////////////
    @PostMapping("/crear")
    public String crearExperiencia(@RequestBody Experiencia expe) {
        expeServ.crearExperiencia(expe);
        return "La experiencia fue creada correctamente";
    }
/////////////////  Para borrar experiencia  ///////////////////
    @DeleteMapping("borrar/{id}")
    public String borrarExperiencia(@PathVariable Long id) {
        expeServ.borrarExperiencia(id);
        return "La experiencia fue borrada correctamente";
    }
 ////////////////  Para buscar experiencia  ///////////////////
    @GetMapping("/buscar/{id}")
    public Experiencia  buscarExperiencia(@PathVariable Long id){
        return expeServ.buscarExperiencia(id);
    }
 /////////////////  Para editar experiencia  ///////////////////
 @PutMapping("/editar/{id}")
 public Experiencia editarExperiencia(@PathVariable("id") Long id,  @RequestBody ExperienciaDto expeDto)
  {
  Experiencia expe = expeServ.buscarExperiencia(id);
        expe.setEmpresa(expeDto.getEmpresa());
        expe.setPuesto(expeDto.getPuesto());
        expe.setInicio_exp(expeDto.getInicio_exp());
        expe.setFin_exp(expeDto.getFin_exp());
        expe.setDescripcion_exp(expeDto.getDescripcion_exp());
        expeServ.crearExperiencia(expe);
        return expe;  
   }      
}
