/*package com.paginaprueba.backprueba.service;

import com.paginaprueba.backprueba.model.Educaciones;
import com.paginaprueba.backprueba.repository.REducaciones;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducaciones {

    @Autowired
    REducaciones rEducaciones;

    public List<Educaciones> list() {
        return rEducaciones.findAll();
    }

    public Optional<Educaciones> getOne(Long id) {
        return rEducaciones.findById(id);
    }

    public Optional<Educaciones> getByTitulacion(String titulacion) {
        return rEducaciones.findByTitulacion(titulacion);
    }

    public void save(Educaciones educ) {
        rEducaciones.save(educ);
    }

    public void delete(Long id) {
        rEducaciones.deleteById(id);
    }

    public boolean existsById(Long id) {
        return rEducaciones.existsById(id);
    }

    public boolean existsByPuesto(String titulacion) {
        return rEducaciones.existsByTitulacion(titulacion);
    }

}
*/