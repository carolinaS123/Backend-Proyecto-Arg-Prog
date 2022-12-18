package com.portfoliocemsArgProg.backportfoliocsalanova.service;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Proyecto;
import com.portfoliocemsArgProg.backportfoliocsalanova.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto implements ISProyecto {

    @Autowired
    RProyecto rProyecto;

    @Override
    public List<Proyecto> verProyectos() {
        List<Proyecto> listaProyectos = rProyecto.findAll();
        return listaProyectos;
    }

    @Override
    public void crearProyecto(Proyecto proyec) {
        rProyecto.save(proyec);
    }

    @Override
    public void borrarProyecto(Long id) {
        rProyecto.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        Proyecto proyec = rProyecto.findById(id).orElse(null);
        return proyec;
    }
}
