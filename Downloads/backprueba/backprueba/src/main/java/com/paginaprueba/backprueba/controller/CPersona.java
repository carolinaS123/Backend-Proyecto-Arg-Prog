package com.paginaprueba.backprueba.controller;

import com.paginaprueba.backprueba.model.Persona;
import com.paginaprueba.backprueba.service.SPersona;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CPersona {

    @Autowired
    SPersona persoServ;

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }

    @PostMapping("/new/persona")
    public String agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
    }

    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("titulo") String nuevoTitulo,
            @RequestParam("acerca_de") String nuevoAcerca_de,
            @RequestParam("url_foto") String nuevoUrl_foto,
            @RequestParam("url_banner") String nuevoUrl_banner) {

//se busca la persona en cuestión
        Persona perso = persoServ.buscarPersona(id);
        //esto también puede ir en service
        //para desacoplar mejor aún el código en un nuevo método
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setTitulo(nuevoTitulo);
        perso.setAcerca_de(nuevoAcerca_de);
        perso.setUrl_foto(nuevoUrl_foto);
        perso.setUrl_banner(nuevoUrl_banner);
        persoServ.crearPersona(perso);
        //retorna la nueva persona
        return perso;
    }
}
