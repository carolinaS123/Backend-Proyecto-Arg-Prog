package com.backportfoliocs.backportfcsalanova.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @Size(max = 60, message = "Longitud incorrecta")
    private String institucion;

    @NotNull
    @Size(max = 60, message = "Longitud incorrecta")
    private String titulacion;

    @NotNull
    @Size(max = 30, message = "Longitud incorrecta")
    private String inicio_edu;

    @NotNull
    @Size(max = 30, message = "Longitud incorrecta")
    private String fin_edu;

    @NotNull
    @Size(max = 1000, message = "Longitud incorrecta")
    private String descripcion_edu;

    //Con esto llama al dato que lo relaciona al objeto persona y lo va a traer con todos sus objetos relacionados 
    @Column(name = "persona_id")
    private Long personaId;

    public Educacion() {
    }

    public Educacion(Long id, String institucion, String titulacion, String inicio_edu, String fin_edu, String descripcion_edu, Long personaId) {
        this.id = id;
        this.institucion = institucion;
        this.titulacion = titulacion;
        this.inicio_edu = inicio_edu;
        this.fin_edu = fin_edu;
        this.descripcion_edu = descripcion_edu;
        this.personaId = personaId;
    }
}
