/*package com.paginaprueba.backprueba.service;

import com.paginaprueba.backprueba.model.Proyectos;
import com.paginaprueba.backprueba.repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos {

    @Autowired
    RProyectos rProyectos;

    public List<Proyectos> list() {
        return rProyectos.findAll();
    }

    public Optional<Proyectos> getOne(Long id) {
        return rProyectos.findById(id);
    }

    public Optional<Proyectos> getByNombre_proy(String nombre_proy) {
        return rProyectos.findByNombre_proy(nombre_proy);
    }

    public void save(Proyectos proye) {
        rProyectos.save(proye);
    }

    public void delete(Long id) {
        rProyectos.deleteById(id);
    }

    public boolean existsById(Long id) {
        return rProyectos.existsById(id);
    }

    public boolean existsByNombre_proy(String nombre_proy) {
        return rProyectos.existsByNombre_proy(nombre_proy);
    }
}
*/