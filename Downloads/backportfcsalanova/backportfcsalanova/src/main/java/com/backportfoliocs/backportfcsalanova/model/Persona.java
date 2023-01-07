package com.backportfoliocs.backportfcsalanova.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="persona")
public class Persona {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
    
     @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String apellido;

    @NotNull
    @Size(min = 1, max = 25, message = "No cumple con la longitud")
    private String titulo;

    @NotNull
    @Lob//annotation q convierte un String en LONGTEXT    
    @Column(length=3000)
    private String acerca_de;

    @NotNull
    @Column(length=5000)
    private String url_foto;

    @NotNull
    @Column(length=5000)
    private String url_banner;

    @NotNull
    @Size(min = 1, max = 25, message = "No cumple con la longitud")
    private String name_usuario;

    @NotNull
    @Size(min = 5, max = 200, message = "No cumple con la longitud")
    private String email;

    @NotNull
    @Size(min = 3, max = 20, message = "No cumple con la longitud")
    private String password;
    
    //////////relación con la tabla experiencias////////
    @OneToMany (mappedBy="personaId")
    private List<Experiencia> experiencias;

    //////////relación con la tabla educaciones////////
    @OneToMany (mappedBy="personaId")
    private List<Educacion> educaciones;
    
    //////////relación con la tabla skills////////
    @OneToMany (mappedBy="personaId")
    private List<Skills> skills;
    
   //////////relación con la tabla proyectos////////
    @OneToMany (mappedBy="personaId")
    private List<Proyecto> proyectos;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String titulo, String acerca_de, String url_foto, String url_banner, String name_usuario, String email, String password, List<Experiencia> experiencias, List<Educacion> educaciones, List<Skills> skills, List<Proyecto> proyectos) {
       
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acerca_de = acerca_de;
        this.url_foto = url_foto;
        this.url_banner = url_banner;
        this.name_usuario = name_usuario;
        this.email = email;
        this.password = password;
        experiencias = new ArrayList();
        educaciones = new ArrayList();
        skills = new ArrayList();
        proyectos = new ArrayList();
    }
    
    
}
