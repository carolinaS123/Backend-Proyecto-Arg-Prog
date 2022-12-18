package com.portfoliocemsArgProg.backportfoliocsalanova.repository;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Long>{

}
