package com.portfolio.elsio.security.repository;

import com.portfolio.elsio.security.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elsio
 */

@Repository
public interface UserRepository extends JpaRepository <User, Integer>{
    Optional<User> findByEmail(String userName);
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);
}
