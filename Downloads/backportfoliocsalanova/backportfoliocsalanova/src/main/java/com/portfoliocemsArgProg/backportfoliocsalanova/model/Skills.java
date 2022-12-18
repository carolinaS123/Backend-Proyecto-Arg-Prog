package com.portfoliocemsArgProg.backportfoliocsalanova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @Min(0)
    @Max(100)
    private int porcentaje;

    //Con esto llama al dato que lo relaciona al objeto persona y lo va a traer con todos sus objetos relacionados 
    @Column(name = "persona_id")
    private Long personaId;

    public Skills() {
    }

    public Skills(String skill, int porcentaje, Long personaId) {
   
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.personaId = personaId;
    }
}
