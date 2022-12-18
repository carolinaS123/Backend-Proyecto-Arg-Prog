package com.portfoliocemsArgProg.backportfoliocsalanova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Table
@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con la longitud")
    private String nombre_proy;

    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud")
    private String descripcion_proy;

    @NotNull
    private String inicio_proy;

    @NotNull
    private String fin_proy;

    @NotNull
    @Lob
    private String imagen_proy;

    @NotNull
    @Lob
    private String link_proy;
    
    //Con esto llama al dato que lo relaciona al objeto persona y lo va a traer con todos sus objetos relacionados 
    @Column(name = "persona_id")
    private Long personaId;

    public Proyecto() {
    }

    public Proyecto(String nombre_proy, String descripcion_proy, String inicio_proy, String fin_proy, String imagen_proy, String link_proy, Long personaId) {
        
        this.nombre_proy = nombre_proy;
        this.descripcion_proy = descripcion_proy;
        this.inicio_proy = inicio_proy;
        this.fin_proy = fin_proy;
        this.imagen_proy = imagen_proy;
        this.link_proy = link_proy;
        this.personaId = personaId;
    }
}
