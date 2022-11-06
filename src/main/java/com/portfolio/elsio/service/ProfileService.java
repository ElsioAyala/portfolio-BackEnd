package com.portfolio.elsio.service;


import com.portfolio.elsio.model.Profile;
import com.portfolio.elsio.repository.ProfileRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elsio
 */
@Service("profile")
public class ProfileService implements IService <Integer, Profile> {
    
    @Autowired
    public ProfileRepository profileRepo;

    @Override
    public void create(Profile o) {
        profileRepo.save(o);
    }

    @Override
    public void update(Profile o) {
        profileRepo.save(o);
    }

    @Override
    public void delete(Integer k) {
        profileRepo.deleteById(k);
    }

    @Override
    public Profile getById(Integer k) {
        return profileRepo.findById(k).orElse(null);
    }

    @Override
    public List<Profile> toList() {
        return profileRepo.findAll();
    }
    
    
}
