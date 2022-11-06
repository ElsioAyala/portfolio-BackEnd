package com.portfolio.elsio.controller;

import com.portfolio.elsio.model.Contact;
import com.portfolio.elsio.service.IService;
import com.yoprogramo.api.model.Message;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author elsio
 */

@RestController
/*@RequestMapping("/contact")*/
@CrossOrigin(origins = {"https://portfolio-cbc05.web.app", "http://localhost:4200"})
public class ContactController {
    @Autowired
    @Qualifier("contact")
    private IService service;
    
    @PostMapping()
    public void createContact(@RequestBody Contact contact){
        
        //User debe de venie en la session y se agrega al nuevo registro de educacion creado.
        //User usuario1 = new User(1,"","","","","","","","");
        //contact.setUser(usuario1);
        service.create(contact);
    }
    
    @GetMapping("/public/contact")
    @ResponseBody
    public List<Contact> listContacts(){
        return service.toList();
    }
    
    
    @PutMapping("/contact")
    public Message apdateContact(@RequestBody Contact contact){
        service.update(contact);
        return new Message("Registro Actualizado");
    }
    
    @GetMapping("/contact/{id}")
    public Contact readContact(@PathVariable Integer id){
        return (Contact) service.getById(id);
    }
    
    @DeleteMapping("/contact/{id}")
    public void deleteContact(@PathVariable Integer id){
        service.delete(id);
    }
}
