package com.backportfoliocs.backportfcsalanova.repository;

import com.backportfoliocs.backportfcsalanova.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Long>{
    
}
