package com.portfoliocemsArgProg.backportfoliocsalanova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
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
    private String acerca_de;

    @NotNull
    @Lob
    private String url_foto;

    @NotNull
    @Lob
    private String url_banner;

    @NotNull
    @Size(min = 1, max = 25, message = "No cumple con la longitud")
    private String name_usuario;

    @NotNull
    @Lob
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
