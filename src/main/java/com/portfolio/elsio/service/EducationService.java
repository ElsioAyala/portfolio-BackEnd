package com.portfolio.elsio.service;

import com.portfolio.elsio.model.Education;
import com.portfolio.elsio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("education")
public class EducationService implements IService<Integer,Education > {
    
    @Autowired
    public EducationRepository educationRepo;

    @Override
    public void create(Education o) {
        educationRepo.save(o);
    }

    @Override
    public void update(Education o) {
        educationRepo.save(o);
    }

    @Override
    public void delete(Integer k) {
        educationRepo.deleteById(k);
    }

    @Override
    public Education getById(Integer k) {
        return educationRepo.findById(k).orElse(null);
    }

    @Override
    public List<Education> toList() {
       return educationRepo.findAll();
    }

}
