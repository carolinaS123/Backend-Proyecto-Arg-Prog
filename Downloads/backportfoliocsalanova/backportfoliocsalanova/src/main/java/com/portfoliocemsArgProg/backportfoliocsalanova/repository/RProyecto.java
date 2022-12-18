package com.portfoliocemsArgProg.backportfoliocsalanova.repository;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto, Long>{

}
