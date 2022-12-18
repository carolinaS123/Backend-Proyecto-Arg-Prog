package com.portfoliocemsArgProg.backportfoliocsalanova.service;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Skills;
import com.portfoliocemsArgProg.backportfoliocsalanova.repository.RSkills;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkills implements ISSkills {

    @Autowired
    RSkills rSkills;

    @Override
    public List<Skills> verSkills() {
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
    public Skills buscarSkill(Long id) {
        Skills habil = rSkills.findById(id).orElse(null);
        return habil;
    }
}
