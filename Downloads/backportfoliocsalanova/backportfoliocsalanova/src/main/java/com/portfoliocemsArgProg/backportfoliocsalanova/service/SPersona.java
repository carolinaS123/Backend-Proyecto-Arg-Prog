package com.portfoliocemsArgProg.backportfoliocsalanova.service;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Persona;
import com.portfoliocemsArgProg.backportfoliocsalanova.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona implements ISPersona{

    @Autowired
    RPersona rPersona;

    @Override
    public List<Persona> verPersonas() {
        List<Persona> listaPersonas = rPersona.findAll();
        return listaPersonas;
    }

    @Override
    public void crearPersona(Persona perso) {
        rPersona.save(perso);
    }

    @Override
    public void borrarPersona(Long id) {
        rPersona.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        Persona perso = rPersona.findById(id).orElse(null);
        return perso;
    }

}
