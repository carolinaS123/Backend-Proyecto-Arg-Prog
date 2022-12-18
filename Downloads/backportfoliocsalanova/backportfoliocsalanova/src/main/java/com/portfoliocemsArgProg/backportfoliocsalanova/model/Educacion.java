package com.portfoliocemsArgProg.backportfoliocsalanova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Table
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 60, message = "No cumple con la longitud")
    private String institucion;

    @NotNull
    @Size(min = 1, max = 60, message = "No cumple con la longitud")
    private String titulacion;

    @NotNull
    private String inicio_edu;

    @NotNull
    private String fin_edu;

    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud")
    private String descripcion_edu;

    //Con esto llama al dato que lo relaciona al objeto persona y lo va a traer con todos sus objetos relacionados 
    @Column(name = "persona_id")
    private Long personaId;

    public Educacion() {
    }

    public Educacion(String institucion, String titulacion, String inicio_edu, String fin_edu, String descripcion_edu, Long personaId) {
   
        this.institucion = institucion;
        this.titulacion = titulacion;
        this.inicio_edu = inicio_edu;
        this.fin_edu = fin_edu;
        this.descripcion_edu = descripcion_edu;
        this.personaId = personaId;
    }
}
