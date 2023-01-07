package com.backportfoliocs.backportfcsalanova.service;

import com.backportfoliocs.backportfcsalanova.model.Skills;
import com.backportfoliocs.backportfcsalanova.repository.RSkills;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkills implements ISSkills {

    @Autowired
    RSkills rSkills;
    
    @Override
    public List<Skills> mostrarSkills() {
        List<Skills> listaSkills = rSkills.findAll();
        return listaSkills;
    }

    @Override
    public void crearSkill(Skills habil) {
        rSkills.save(habil);
    }

    @Override
    public void borrarSkill(Long id) {
        rSkills.deleteById(id);
    }

    @Override
    public Skills editarSkill(Long id) {
        //terminar de hacer el metodo de editar
        Skills habil = rSkills.findById(id).orElse(null);
        return habil;
    }

    @Override
    public Skills buscarSkill(Long id) {
        Skills habil = rSkills.findById(id).orElse(null);
        return habil;
    }
}
