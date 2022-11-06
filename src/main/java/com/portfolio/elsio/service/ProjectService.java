package com.portfolio.elsio.service;

import com.portfolio.elsio.model.Project;
import com.portfolio.elsio.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elsio
 */
@Service("project")
public class ProjectService implements IService <Integer, Project>{

    @Autowired
    public ProjectRepository projectRepo;
    
    @Override
    public void create(Project o) {
        projectRepo.save(o);
    }

    @Override
    public void update(Project o) {
        projectRepo.save(o);
    }

    @Override
    public void delete(Integer k) {
         projectRepo.deleteById(k);
    }

    @Override
    public Project getById(Integer k) {
        return projectRepo.findById(k).orElse(null);
    }

    @Override
    public List<Project> toList() {
        return projectRepo.findAll();
    }
    
}
