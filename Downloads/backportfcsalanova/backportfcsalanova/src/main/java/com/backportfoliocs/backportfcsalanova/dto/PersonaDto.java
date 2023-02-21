package com.backportfoliocs.backportfcsalanova.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDto {
    private String nombre;
    private String apellido;
    private String titulo;
    private String acerca_de;
    private String url_foto;
    private String url_banner;
    private String name_usuario;
    private String email;
    private String password;

    public PersonaDto() {
    }

    public PersonaDto(String nombre, String apellido, String titulo, String acerca_de, String url_foto, String url_banner, String name_usuario, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acerca_de = acerca_de;
        this.url_foto = url_foto;
        this.url_banner = url_banner;
        this.name_usuario = name_usuario;
        this.email = email;
        this.password = password;
    }
    
}
