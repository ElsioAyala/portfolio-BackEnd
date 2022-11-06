package com.portfolio.elsio.controller;

import com.yoprogramo.api.model.Message;
import com.portfolio.elsio.model.Project;
import com.portfolio.elsio.service.IService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author elsio
 */

@RestController
@RequestMapping("/project")
@CrossOrigin(origins = {"https://portfolio-cbc05.web.app", "http://localhost:4200"})
public class ProjectController {
    @Autowired
    @Qualifier("project")
    private IService service;
    
    @PostMapping()
    public Message createProject(@RequestBody Project project){
        
        //User debe de venie en la session y se agrega al nuevo registro de educacion creado.
        /*User usuario1 = new User(1,"","","","","","","","");
        project.setUser(usuario1);*/
        service.create(project);
        return new Message("Se agrego un Proyecto");
    }
    
    @GetMapping()
    @ResponseBody
    public List<Project> listProject(){
        return service.toList();
    }
    
    
    @PutMapping()
    public Message apdateEducation(@RequestBody Project project){
        service.update(project);
        return new Message("Registro Actualizado");
    }
    
    @GetMapping("/{id}")
    public Project readproject(@PathVariable Integer id){
        return (Project) service.getById(id);
    }
    
    @DeleteMapping("/{id}")
    public Message deleteProject(@PathVariable Integer id){
        service.delete(id);
        return new Message("Registro Eliminado");
    }
}
