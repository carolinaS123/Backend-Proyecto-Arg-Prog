package com.backportfoliocs.backportfcsalanova.service;

import com.backportfoliocs.backportfcsalanova.model.Educacion;
import com.backportfoliocs.backportfcsalanova.repository.REducacion;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion implements ISEducacion {

    @Autowired
    REducacion rEducacion;

    @Override
     public List<Educacion> mostrarEducaciones() {
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
    public Educacion editarEducacion(Long id) {
        Educacion edu = rEducacion.findById(id).orElse(null);
        return edu;
    }
    
    @Override
    public Educacion buscarEducacion(Long id) {
        Educacion edu = rEducacion.findById(id).orElse(null);
        return edu;
    }
    
    
}
