package com.portfoliocemsArgProg.backportfoliocsalanova.controller;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Skills;
import com.portfoliocemsArgProg.backportfoliocsalanova.service.SSkills;
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
public class CSkilks {

    @Autowired
    private SSkills skillsServ;
    
    /////////////////  Para ver todos los skills ///////////////////
    @GetMapping("/ver/skills")
    @ResponseBody
    public List<Skills> verSkills() {
        return skillsServ.verSkills();
    }
/////////////////  Para crear skill  ///////////////////
    @PostMapping("/new/skill")
    public String agregarSkill(@RequestBody Skills habil) {
        skillsServ.crearSkill(habil);
        return "El skill fue creado correctamente";
    }
/////////////////  Para borrar un skill  ///////////////////
    @DeleteMapping("/delete/skill/{id}")
    public String eliminarSkill(@PathVariable Long id) {
        skillsServ.borrarSkill(id);
        return "El skill fue borrado correctamente";
    }
////////////////  Para buscar un skill  ///////////////////
    @GetMapping("/buscar/skill/{id}")
    public Skills  buscarSkill(@PathVariable Long id){
        return skillsServ.buscarSkill(id);
    }
/////////////////  Para editar un skill  ///////////////////
    @PutMapping("/skills/editar/{id}")
    public Skills editSkill(@PathVariable Long id,
            @RequestParam("skill") String nuevoSkill,
            @RequestParam("porcentaje") int nuevoPorcentaje,
            @RequestParam("personaId") Long nuevaPersonaId) {

//se busca el skill
        Skills habil = skillsServ.buscarSkill(id);
        habil.setSkill(nuevoSkill);
        habil.setPorcentaje(nuevoPorcentaje);
        habil.setPersonaId(nuevaPersonaId);
        skillsServ.crearSkill(habil);
        //retorna el nuevo skill
        return habil;
    }
}
