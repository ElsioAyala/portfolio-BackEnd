package com.portfolio.elsio.security.service;

import com.portfolio.elsio.security.model.MainUser;
import com.portfolio.elsio.security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author elsio
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    UserService userService;
    
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userService.getByUserName(userName).get();
        return MainUser.build(user);
    }
    
}
