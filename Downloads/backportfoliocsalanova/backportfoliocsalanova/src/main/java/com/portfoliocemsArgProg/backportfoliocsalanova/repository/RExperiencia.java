package com.portfoliocemsArgProg.backportfoliocsalanova.repository;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Long>{
     
}