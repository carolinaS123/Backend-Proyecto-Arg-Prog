package com.backportfoliocs.backportfcsalanova.controller;

import com.backportfoliocs.backportfcsalanova.model.Persona;
import com.backportfoliocs.backportfcsalanova.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
    @Autowired
    private SPersona persoServ;
    
    /////////////////Para autenticacion///////////////////
    @PostMapping("/authentication/login")
    public Persona loginPersona(@RequestBody Persona perso){
          return persoServ.loginPersona(perso.getEmail(), perso.getPassword());
    }
    
/////////////////  Para ver todas las personas ///////////////////
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }
/////////////////  Para crear persona  ///////////////////
    @PostMapping("/new/persona")
    public String agregarPersona(@RequestBody Persona perso) {
        persoServ.crearPersona(perso);
        return "La persona fue creada correctamente";
    }
/////////////////  Para borrar persona  ///////////////////
    @DeleteMapping("/personas/delete/persona/{id}")
    public String eliminarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
    }
  ////////////////  Para buscar persona  ///////////////////
 @GetMapping("/personas/buscar/persona/{id}")
    public Persona buscarPersona(@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
//////////////////para ver persona///////////////
@GetMapping("/personas/traer/persona")   
public Persona findPersona( ){
    return persoServ.findPersona((long)1);
}
/////////////////  Para editar persona  ///////////////////
    @PostMapping("/editar/persona")
    public String editarPersona(@RequestBody Persona perso) {
        persoServ.crearPersona(perso);
        return "La persona fue editada correctamente";
    }
    /*
/////////////////  Para editar persona  ///////////////////
    @PutMapping("/personas/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,@RequestParam("nombre") String nuevoNombre,@RequestParam("apellido") String nuevoApellido,
            @RequestParam("titulo") String nuevoTitulo,
            @RequestParam("acerca_de") String nuevoAcerca_de,
            @RequestParam("url_foto") String nuevoUrl_foto,
            @RequestParam("url_banner") String nuevoUrl_banner,
            @RequestParam("name_usuario") String nuevoName_usuario,
            @RequestParam("email") String nuevoEmail,
            @RequestParam("password") String nuevoPassword) {
//se busca la persona 
        Persona perso = persoServ.buscarPersona(id);
        //esto también puede ir en service
        //para desacoplar mejor aún el código en un nuevo método
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setTitulo(nuevoTitulo);
        perso.setAcerca_de(nuevoAcerca_de);
        perso.setUrl_foto(nuevoUrl_foto);
        perso.setUrl_banner(nuevoUrl_banner);
        perso.setName_usuario(nuevoName_usuario);
        perso.setEmail(nuevoEmail);   
        perso.setPassword(nuevoPassword);
        persoServ.crearPersona(perso);
        //retorna la nueva persona
        return perso;
    }*/
}
