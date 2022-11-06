package com.portfolio.elsio.security.service;

import com.portfolio.elsio.security.model.User;
import com.portfolio.elsio.security.repository.UserRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elsio
 */
@Service
@Transactional
public class UserService {

    @Autowired

    UserRepository userRepository;

    public Optional<User> getByUserName(String userName) {
        return userRepository.findByEmail(userName);
    }

    public boolean existsByUserName(String userName) {
        return userRepository.existsByUserName(userName);
    }

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
