package com.portfoliocemsArgProg.backportfoliocsalanova.service;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Educacion;
import com.portfoliocemsArgProg.backportfoliocsalanova.repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion implements ISEducacion {
    @Autowired
    REducacion rEducacion;

    @Override
    public List<Educacion> verEducaciones() {
        List<Educacion> listaEducaciones = rEducacion.findAll();
        return listaEducaciones;
    }

    @Override
    public void crearEducacion(Educacion edu) {
        rEducacion.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        rEducacion.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        Educacion edu = rEducacion.findById(id).orElse(null);
        return edu;
    }
}
