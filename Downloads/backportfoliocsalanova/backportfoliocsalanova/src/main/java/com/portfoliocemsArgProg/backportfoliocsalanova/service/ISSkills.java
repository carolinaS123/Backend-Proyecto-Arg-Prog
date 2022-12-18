package com.portfoliocemsArgProg.backportfoliocsalanova.service;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Skills;
import java.util.List;

public interface ISSkills {
    
    //metodo para traer todas las skills
    public List<Skills> verSkills();

    //metodo para dar de alta una skill
    public void crearSkill(Skills habil);

    //metodo para borrar una skill
    public void borrarSkill(Long id);

    //metodo para encontrar una skill
    public Skills buscarSkill(Long id);
}
