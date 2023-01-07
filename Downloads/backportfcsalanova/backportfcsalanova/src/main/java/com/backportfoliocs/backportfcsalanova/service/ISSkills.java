package com.backportfoliocs.backportfcsalanova.service;

import com.backportfoliocs.backportfcsalanova.model.Skills;
import java.util.List;

public interface ISSkills {
    //metodo para traer todos los skills
    public List<Skills> mostrarSkills();

    //metodo para dar de alta un skill
    public void crearSkill(Skills habil);

    //metodo para borrar un skill
    public void borrarSkill(Long id);

    //metodo para editar un skill
    public Skills editarSkill(Long id);
    
    //metodo para encontrar un skill
    public Skills buscarSkill(Long id);
}
