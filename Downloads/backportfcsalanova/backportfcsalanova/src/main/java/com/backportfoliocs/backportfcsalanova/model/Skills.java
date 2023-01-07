package com.backportfoliocs.backportfcsalanova.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Table
@Entity
public class Skills {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 30, message = "No cumple con la longitud")
    private String skill;

    @NotNull
    @Min(value = 0) @Max(value = 100)
    private int porcentaje;

    //Con esto llama al dato que lo relaciona al objeto persona y lo va a traer con todos sus objetos relacionados 
    @Column(name = "persona_id")
    private Long personaId;

    public Skills() {
    }

    public Skills(Long id, String skill, int porcentaje, Long personaId) {
        this.id = id;
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.personaId = personaId;
    }
}
