package com.portfolio.elsio.security.service;

import com.portfolio.elsio.security.enums.RolName;
import com.portfolio.elsio.security.model.Rol;
import com.portfolio.elsio.security.repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elsio
 */
@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRoleName(RolName rolName){
        return rolRepository.findByRoleName(rolName);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
