package com.backportfoliocs.backportfcsalanova.repository;

import com.backportfoliocs.backportfcsalanova.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Long>{
    
}
