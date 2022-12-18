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
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con la longitud")
    private String empresa;

    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con la longitud")
    private String puesto;

    @NotNull
    private String inicio_exp;

    @NotNull
    private String fin_exp;

    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud")
    private String descripcion_exp;

    //Con esto llama al dato que lo relaciona al objeto persona y lo va a traer con todos sus objetos relacionados 
    @Column(name = "persona_id")
    private Long personaId;

    public Experiencia() {
    }

    public Experiencia(String empresa, String puesto, String inicio_exp, String fin_exp, String descripcion_exp, Long personaId) {
      
        this.empresa = empresa;
        this.puesto = puesto;
        this.inicio_exp = inicio_exp;
        this.fin_exp = fin_exp;
        this.descripcion_exp = descripcion_exp;
        this.personaId = personaId;
    }
}
