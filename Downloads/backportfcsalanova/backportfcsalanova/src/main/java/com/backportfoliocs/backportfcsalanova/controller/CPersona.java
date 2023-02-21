package com.backportfoliocs.backportfcsalanova.controller;

import com.backportfoliocs.backportfcsalanova.dto.PersonaDto;
import com.backportfoliocs.backportfcsalanova.model.Persona;
import com.backportfoliocs.backportfcsalanova.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personas")
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
    @GetMapping("/mostrar")
    //@ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }
/////////////////  Para crear persona  ///////////////////
    @PostMapping("/crear")
    public String agregarPersona(@RequestBody Persona perso) {
        persoServ.crearPersona(perso);
        return "La persona fue creada correctamente";
    }
/////////////////  Para borrar persona  ///////////////////
    @DeleteMapping("/borrar/{id}")
    public String eliminarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
    }
  ////////////////  Para buscar persona  ///////////////////
 @GetMapping("/buscar/{id}")
    public Persona buscarPersona(@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
    
//////////////////para ver persona///////////////
@GetMapping("/traer")   
public Persona findPersona( ){
    return persoServ.findPersona((long)1);
}
    
/////////////////  Para editar persona  ///////////////////
@PutMapping("/editar/{id}")
public Persona editarPersona(@PathVariable("id") Long id,  @RequestBody PersonaDto persoDto)
  {
       Persona perso = persoServ.buscarPersona(id);
        perso.setNombre(persoDto.getNombre());
        perso.setApellido(persoDto.getApellido());
        perso.setTitulo(persoDto.getTitulo());
        perso.setAcerca_de(persoDto.getAcerca_de());
        perso.setUrl_foto(persoDto.getUrl_foto());
        perso.setUrl_banner(persoDto.getUrl_banner());
        perso.setName_usuario(persoDto.getName_usuario());
        perso.setEmail(persoDto.getEmail());   
        perso.setPassword(persoDto.getPassword());
        persoServ.crearPersona(perso);
        return perso;
    }        
       
}
