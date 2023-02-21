package com.backportfoliocs.backportfcsalanova.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SkillsDto {
   private String skill;
    @Min(0)
    @Max(100)
    private int porcentaje;

    public SkillsDto() {
    }

    public SkillsDto(String skill, int porcentaje) {
        this.skill = skill;
        this.porcentaje = porcentaje;
    }
}
