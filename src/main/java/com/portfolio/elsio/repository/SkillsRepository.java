package com.portfolio.elsio.repository;

import com.portfolio.elsio.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <Skills, Integer>{
    
}
