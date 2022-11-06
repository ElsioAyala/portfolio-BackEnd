package com.portfolio.elsio.security.repository;


import com.portfolio.elsio.security.enums.RolName;
import com.portfolio.elsio.security.model.Rol;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elsio
 */
@Repository
public interface RolRepository extends JpaRepository <Rol, Integer> {
    Optional<Rol> findByRoleName(RolName rolName);
}
