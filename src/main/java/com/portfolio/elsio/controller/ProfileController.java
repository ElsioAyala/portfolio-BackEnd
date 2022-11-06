
package com.portfolio.elsio.controller;

import com.yoprogramo.api.model.Message;
import com.portfolio.elsio.model.Profile;
import com.portfolio.elsio.service.IService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author elsio
 */


@RestController
@CrossOrigin(origins = {"https://portfolio-cbc05.web.app", "http://localhost:4200"})
public class ProfileController {
        
    @Autowired
    @Qualifier("profile")
    private IService service;
   
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/profile")
    public void createProfile(@RequestBody Profile profile){
        service.create(profile);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/profile")
    @ResponseBody
    public List<Profile> listProfile(){
        
        return service.toList();
    }
    
    @PutMapping("/profile")
    public Message apdateprofile(@RequestBody Profile profile){
        service.update(profile);
        return new Message("Registro Actualizado");
    }
    
    @GetMapping("public/profile/{id}")
    public Profile readProfile(@PathVariable Integer id){
        return (Profile) service.getById(id);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/profile/{id}")
    public void deleteProfile(@PathVariable Integer id){
        service.delete(id);
    }
    
    
}
