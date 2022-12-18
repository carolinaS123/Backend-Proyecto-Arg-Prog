package com.portfoliocemsArgProg.backportfoliocsalanova.controller;
import com.portfoliocemsArgProg.backportfoliocsalanova.model.Experiencia;
import com.portfoliocemsArgProg.backportfoliocsalanova.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CExperiencia {
    @Autowired
    private SExperiencia expeServ;
    
/////////////////  Para ver todas las experiencias ///////////////////
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return expeServ.verExperiencias();
    }
/////////////////  Para crear experiencia  ///////////////////
    @PostMapping("/new/experiencia")
    public String agregarExperiencia(@RequestBody Experiencia expe) {
        expeServ.crearExperiencia(expe);
        return "La experiencia fue creada correctamente";
    }
/////////////////  Para borrar experiencia  ///////////////////
    @DeleteMapping("/delete/experiencia/{id}")
    public String eliminarExperiencia(@PathVariable Long id) {
        expeServ.borrarExperiencia(id);
        return "La experiencia fue borrada correctamente";
    }
 ////////////////  Para buscar experiencia  ///////////////////
    @GetMapping("/buscar/experiencia/{id}")
    public Experiencia  buscarExperiencia(@PathVariable Long id){
        return expeServ.buscarExperiencia(id);
    }
    
/////////////////  Para editar experiencia  ///////////////////
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,@RequestParam("empresa") String nuevaEmpresa,
            @RequestParam("puesto") String nuevoPuesto,
            @RequestParam("inicio_exp") String nuevoInicio_exp,
            @RequestParam("fin_exp") String nuevoFin_exp,
            @RequestParam("descripcion_exp") String nuevaDescripcion_exp,
            @RequestParam("personaId") Long nuevaPersonaId) {
//se busca la experiencia 
        Experiencia expe = expeServ.buscarExperiencia(id);
        expe.setEmpresa(nuevaEmpresa);
        expe.setPuesto(nuevoPuesto);
        expe.setInicio_exp(nuevoInicio_exp);
        expe.setFin_exp(nuevoFin_exp);
        expe.setDescripcion_exp(nuevaDescripcion_exp);
        expe.setPersonaId(nuevaPersonaId);
        expeServ.crearExperiencia(expe);
        //retorna la nueva experiencia
        return expe;
    }
}
