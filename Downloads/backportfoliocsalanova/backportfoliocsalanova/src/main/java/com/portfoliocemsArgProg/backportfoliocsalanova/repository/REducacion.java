package com.portfoliocemsArgProg.backportfoliocsalanova.repository;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Long>{

}
