package com.backportfoliocs.backportfcsalanova.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @Size(max = 60, message = "Longitud incorrecta")
    private String nombre_proy;

    @NotNull
    @Size(max = 1000, message = "Longitud incorrecta")
    private String descripcion_proy;

    @NotNull
    @Size(max = 30, message = "Longitud incorrecta")
    private String inicio_proy;

    @NotNull
    @Size(max = 30, message = "Longitud incorrecta")
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

    public Proyecto(Long id, String nombre_proy, String descripcion_proy, String inicio_proy, String fin_proy, String imagen_proy, String link_proy, Long personaId) {
        this.id = id;
        this.nombre_proy = nombre_proy;
        this.descripcion_proy = descripcion_proy;
        this.inicio_proy = inicio_proy;
        this.fin_proy = fin_proy;
        this.imagen_proy = imagen_proy;
        this.link_proy = link_proy;
        this.personaId = personaId;
    }
}
