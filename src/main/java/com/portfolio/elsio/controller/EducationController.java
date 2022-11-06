package com.portfolio.elsio.controller;

import com.portfolio.elsio.model.Education;
import com.portfolio.elsio.service.IService;
import com.yoprogramo.api.model.Message;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author elsio
 */

@RestController
@RequestMapping("/education")
@CrossOrigin(origins = {"https://portfolio-cbc05.web.app", "http://localhost:4200"})
public class EducationController {
    @Autowired
    @Qualifier("education")
    private IService service;
    
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, String> createEducation(@RequestBody Education education){
        
        service.create(education);
        Map<String, String> message = new HashMap<>();
        message.put("message", "Se agrego Educación");
        return  message;
    }
    
    @GetMapping()
    @ResponseBody
    public List<Education> listEducation(){
        return service.toList();
    }
    

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public Message apdateEducation(@RequestBody Education education){
        service.update(education);
        return new Message("Registro Actualizado");
    }
    
    @GetMapping("/{id}")
    public Education readEducation(@PathVariable Integer id){
        return (Education) service.getById(id);
    }
    
    @DeleteMapping("/{id}")
    public Message deleteEducation(@PathVariable Integer id){
        service.delete(id);
        return new Message("Registro Eliminado");
    }
    
}
