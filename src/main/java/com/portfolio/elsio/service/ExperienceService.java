package com.portfolio.elsio.service;

import com.portfolio.elsio.model.Experience;
import com.portfolio.elsio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elsio
 */
@Service("experience")
public class ExperienceService implements IService <Integer, Experience> {
    
    @Autowired
    public ExperienceRepository experienceRepo;

    @Override
    public void create(Experience o) {
        experienceRepo.save(o);
    }

    @Override
    public void update(Experience o) {
        experienceRepo.save(o);
    }

    @Override
    public void delete(Integer k) {
        experienceRepo.deleteById(k);
    }

    @Override
    public Experience getById(Integer k) {
        return experienceRepo.findById(k).orElse(null);
    }

    @Override
    public List<Experience> toList() {
        return experienceRepo.findAll();
    }
    
}
