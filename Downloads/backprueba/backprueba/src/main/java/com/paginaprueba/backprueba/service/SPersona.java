package com.paginaprueba.backprueba.service;

import com.paginaprueba.backprueba.model.Persona;
import com.paginaprueba.backprueba.repository.RPersona;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona implements ISPersona {

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
