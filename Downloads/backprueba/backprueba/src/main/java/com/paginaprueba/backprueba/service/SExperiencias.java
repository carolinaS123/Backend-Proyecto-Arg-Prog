/*package com.paginaprueba.backprueba.service;

import com.paginaprueba.backprueba.model.Experiencias;
import com.paginaprueba.backprueba.repository.RExperiencias;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencias {

    @Autowired
    RExperiencias rExperiencias;

    public List<Experiencias> list() {
        return rExperiencias.findAll();
    }

    public Optional<Experiencias> getOne(Long id) {
        return rExperiencias.findById(id);
    }

    public Optional<Experiencias> getByPuesto(String puesto) {
        return rExperiencias.findByPuesto(puesto);
    }

    public void save(Experiencias expe) {
        rExperiencias.save(expe);
    }

    public void delete(Long id) {
        rExperiencias.deleteById(id);
    }

    public boolean existsById(Long id) {
        return rExperiencias.existsById(id);
    }

    public boolean existsByPuesto(String puesto) {
        return rExperiencias.existsByPuesto(puesto);
    }
}
*/