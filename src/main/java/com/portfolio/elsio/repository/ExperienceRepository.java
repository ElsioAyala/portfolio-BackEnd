
package com.portfolio.elsio.repository;

import com.portfolio.elsio.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository <Experience, Integer> {
    
}
