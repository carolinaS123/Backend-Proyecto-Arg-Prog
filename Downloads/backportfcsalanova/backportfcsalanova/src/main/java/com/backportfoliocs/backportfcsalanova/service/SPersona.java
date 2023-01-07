package com.backportfoliocs.backportfcsalanova.service;

import com.backportfoliocs.backportfcsalanova.model.Persona;
import com.backportfoliocs.backportfcsalanova.repository.RPersona;
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
   
    public Persona findPersona(Long id ) {
        Persona personita =  rPersona.findById(id).orElse(null);
        return personita;
    }
   public Persona loginPersona(String email, String password){
    List<Persona> personas=rPersona.findByEmailAndPassword(email, password);
    if(!personas.isEmpty()){
        return personas.get(0);
     }
    return null;
   }
}
