package com.portfolio.elsio.controller;

import com.yoprogramo.api.model.Message;
import com.portfolio.elsio.model.Skills;
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
@RequestMapping("/skills")
@CrossOrigin(origins = {"https://portfolio-cbc05.web.app", "http://localhost:4200"})
public class SkillsController {
    @Autowired
    @Qualifier("skills")
    private IService service;
    
    @PostMapping()
    public Message createSkills(@RequestBody Skills skills){
        
        //User debe de venie en la session y se agrega al nuevo registro de educacion creado.
        /*User usuario1 = new User(1,"","","","","","","","");
        skills.setUser(usuario1);*/
        service.create(skills);
        return new Message("Se agrego Skill");
    }
    
    @GetMapping()
    @ResponseBody
    public List<Skills> listSkills(){
        return service.toList();
    }
    
    
    @PutMapping()
    public Message apdateSkills(@RequestBody Skills skills){
        service.update(skills);
        return new Message("Registro Actualizado");
    }
    
    @GetMapping("/{id}")
    public Skills readSkills(@PathVariable Integer id){
        return (Skills) service.getById(id);
    }
    
    @DeleteMapping("/{id}")
    public Message deleteSkills(@PathVariable Integer id){
        service.delete(id);
        return new Message("Registro Eliminado");
    }
}
