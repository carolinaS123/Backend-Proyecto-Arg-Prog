package com.backportfoliocs.backportfcsalanova.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ExperienciaDto {
    private String empresa;
    private String puesto;
    private String inicio_exp;
    private String fin_exp;
    private String descripcion_exp;

    public ExperienciaDto() {
    }

    public ExperienciaDto(String empresa, String puesto, String inicio_exp, String fin_exp, String descripcion_exp) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.inicio_exp = inicio_exp;
        this.fin_exp = fin_exp;
        this.descripcion_exp = descripcion_exp;
    }
    
}
