package com.portfoliocemsArgProg.backportfoliocsalanova.service;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Experiencia;
import com.portfoliocemsArgProg.backportfoliocsalanova.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia implements ISExperiencia {

    @Autowired
    RExperiencia rExperiencia;

    @Override
    public List<Experiencia> verExperiencias() {
        List<Experiencia> listaExperiencias = rExperiencia.findAll();
        return listaExperiencias;
    }

    @Override
    public void crearExperiencia(Experiencia expe) {
        rExperiencia.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        rExperiencia.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        Experiencia expe = rExperiencia.findById(id).orElse(null);
        return expe;
    }
}
