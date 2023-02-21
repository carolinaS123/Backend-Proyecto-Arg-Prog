package com.backportfoliocs.backportfcsalanova.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProyectoDto {
    private String nombre_proy;
    private String descripcion_proy;
    private String inicio_proy;
    private String fin_proy;
    private String imagen_proy;
    private String link_proy;

    public ProyectoDto() {
    }

    public ProyectoDto(String nombre_proy, String descripcion_proy, String inicio_proy, String fin_proy, String imagen_proy, String link_proy) {
        this.nombre_proy = nombre_proy;
        this.descripcion_proy = descripcion_proy;
        this.inicio_proy = inicio_proy;
        this.fin_proy = fin_proy;
        this.imagen_proy = imagen_proy;
        this.link_proy = link_proy;
    }

}
