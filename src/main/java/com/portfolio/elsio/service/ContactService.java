package com.portfolio.elsio.service;

import com.portfolio.elsio.model.Contact;
import com.portfolio.elsio.repository.ContactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("contact")
public class ContactService implements IService<Integer,Contact > {
    
    @Autowired
    public ContactRepository contactRepo;

    @Override
    public void create(Contact o) {
        contactRepo.save(o);
    }

    @Override
    public void update(Contact o) {
        contactRepo.save(o);
    }

    @Override
    public void delete(Integer k) {
        contactRepo.deleteById(k);
    }

    @Override
    public Contact getById(Integer k) {
        return contactRepo.findById(k).orElse(null);
    }

    @Override
    public List<Contact> toList() {
       return contactRepo.findAll();
    }

}
