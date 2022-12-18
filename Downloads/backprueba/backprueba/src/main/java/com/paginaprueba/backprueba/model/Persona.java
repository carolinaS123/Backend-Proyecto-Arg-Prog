package com.paginaprueba.backprueba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String acerca_de;
    private String url_foto;
    private String url_banner;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String titulo, String acerca_de, String url_foto, String url_banner) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acerca_de = acerca_de;
        this.url_foto = url_foto;
        this.url_banner = url_banner;
    }
    
}
