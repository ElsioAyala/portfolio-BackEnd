package com.portfolio.elsio.service;

import com.portfolio.elsio.model.Skills;
import com.portfolio.elsio.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elsio
 */
@Service("skills")
public class SkillsService implements IService <Integer, Skills> {
    
    @Autowired
    public SkillsRepository skillsRepo;

    @Override
    public void create(Skills o) {
       skillsRepo.save(o);
    }

    @Override
    public void update(Skills o) {
       skillsRepo.save(o);
    }

    @Override
    public void delete(Integer k) {
        skillsRepo.deleteById(k);
    }

    @Override
    public Skills getById(Integer k) {
       return skillsRepo.findById(k).orElse(null);
    }

    @Override
    public List<Skills> toList() {
        return skillsRepo.findAll();
    }
    
}
