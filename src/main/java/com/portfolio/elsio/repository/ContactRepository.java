package com.portfolio.elsio.repository;

import com.portfolio.elsio.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elsio
 */
@Repository
public interface ContactRepository extends JpaRepository <Contact, Integer> {
    
}
