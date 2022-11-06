package com.portfolio.elsio.controller;

import com.portfolio.elsio.model.Experience;
import com.portfolio.elsio.service.IService;
import com.yoprogramo.api.model.Message;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@RequestMapping("/experience")
@CrossOrigin(origins = {"https://portfolio-cbc05.web.app", "http://localhost:4200"})
public class ExperienceController {
    @Autowired
    @Qualifier("experience")
    private IService service;
    
    @PostMapping()
    public Map<String, String>  createExperience(@RequestBody Experience experience){
        
        service.create(experience);
        Map<String, String> message = new HashMap<>();
        message.put("message", "Se agrego Expereincia");
        return  message;
    }
    
    @GetMapping()
    @ResponseBody
    public List<Experience> listExperience(){
        return service.toList();
    }
    
    
    @PutMapping()
    public Message apdateExperience(@RequestBody Experience experience){
        service.update(experience);
        return new Message("Registro Actualizado");
    }
    
    @GetMapping("/{id}")
    public Experience readExperience(@PathVariable Integer id){
        return (Experience) service.getById(id);
    }
    
    @DeleteMapping("/{id}")
    public Message deleteExperience(@PathVariable Integer id){
        service.delete(id);
        return new Message("Registro Eliminado");
    }
}
