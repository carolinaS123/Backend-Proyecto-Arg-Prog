package com.backportfoliocs.backportfcsalanova.controller;

import com.backportfoliocs.backportfcsalanova.dto.SkillsDto;
import com.backportfoliocs.backportfcsalanova.model.Skills;
import com.backportfoliocs.backportfcsalanova.service.SSkills;
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
@RequestMapping("skills")
@CrossOrigin(origins = "http://localhost:4200")
public class CSkills {
        @Autowired
    private SSkills skillsServ;
    
/////////////////  Para ver todos los skills ///////////////////
    @GetMapping("/mostrar")
    public List<Skills> mostrarSkills() {
        return skillsServ.mostrarSkills();
    }
/////////////////  Para crear skill  ///////////////////
    @PostMapping("/crear")
    public String crearSkill(@RequestBody Skills habil) {
        skillsServ.crearSkill(habil);
        return "El skill fue creado correctamente";
    }
/////////////////  Para borrar un skill  ///////////////////
    @DeleteMapping("/borrar/{id}")
    public String borrarSkill(@PathVariable Long id) {
        skillsServ.borrarSkill(id);
        return "El skill fue borrado correctamente";
    }
////////////////  Para buscar un skill  ///////////////////
    @GetMapping("/buscar/{id}")
    public Skills  buscarSkill(@PathVariable Long id){
        return skillsServ.buscarSkill(id);
    }
 /////////////////  Para editar un skill  ///////////////////Este si funciona
   @PutMapping("/editar/{id}")
    public Skills editarSkill(@PathVariable("id") Long id, @RequestBody SkillsDto skillsDto)
    {
       Skills habil = skillsServ.buscarSkill(id);
        habil.setSkill(skillsDto.getSkill());
        habil.setPorcentaje(skillsDto.getPorcentaje());
       skillsServ.crearSkill(habil);
       return habil;
    }
    
/////////////////  Para editar un skill  ///////////////////Este no funciona
 /*   @PutMapping("/editar/{id}")
    public Skills editarSkill(@PathVariable ("id") Long id, @RequestParam("skill") String nuevoSkill, @RequestParam("porcentaje") int nuevoPorcentaje)
    {
        //se busca el skill
        Skills habil = skillsServ.buscarSkill(id);
        habil.setSkill(nuevoSkill);
        habil.setPorcentaje(nuevoPorcentaje);
        skillsServ.crearSkill(habil);
        //retorna el nuevo skill
        return habil;
    }*/
}
