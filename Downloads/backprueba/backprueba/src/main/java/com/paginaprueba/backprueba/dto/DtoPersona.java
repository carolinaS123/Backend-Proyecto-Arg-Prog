package com.paginaprueba.backprueba.dto;

public class DtoPersona {

    private String nombre;
    private String apellido;
    private String titulo;
    private String acerca_de;
    private String url_foto;
    private String url_banner;
/*
    private String empresa;
    private String puesto;
    private String inicio_exp;
    private String fin_exp;
    private String descripcion_exp;

    private String institucion;
    private String titulacion;
    private String inicio_edu;
    private String fin_edu;
    private String descripcion_edu;

    private String skill;
    private String porcentaje;

    private String nombre_proy;
    private String descripcion_proy;
    private String inicio_proy;
    private String fin_proy;
    private String imagen_proy;
    private String link_proy;
*/
    public DtoPersona() {
    }

    public DtoPersona(String nombre, String apellido, String titulo, String acerca_de, String url_foto, String url_banner/*, String empresa, String puesto, String inicio_exp, String fin_exp, String descripcion_exp, String institucion, String titulacion, String inicio_edu, String fin_edu, String descripcion_edu, String skill, String porcentaje, String nombre_proy, String descripcion_proy, String inicio_proy, String fin_proy, String imagen_proy, String link_proy*/) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acerca_de = acerca_de;
        this.url_foto = url_foto;
        this.url_banner = url_banner;
        /*
        this.empresa = empresa;
        this.puesto = puesto;
        this.inicio_exp = inicio_exp;
        this.fin_exp = fin_exp;
        this.descripcion_exp = descripcion_exp;
        this.institucion = institucion;
        this.titulacion = titulacion;
        this.inicio_edu = inicio_edu;
        this.fin_edu = fin_edu;
        this.descripcion_edu = descripcion_edu;
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.nombre_proy = nombre_proy;
        this.descripcion_proy = descripcion_proy;
        this.inicio_proy = inicio_proy;
        this.fin_proy = fin_proy;
        this.imagen_proy = imagen_proy;
        this.link_proy = link_proy;
*/
    }

    
    
}
