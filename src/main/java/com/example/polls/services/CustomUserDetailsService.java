package com.example.polls.services;


import com.example.polls.model.User;
import com.example.polls.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.nio.file.attribute.UserPrincipal;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String usernameOrEmail)
            throws UsernameNotFoundException {

        // Let people login with either username or email...
        User user = userRepository.findByEmailOrUsername(usernameOrEmail,usernameOrEmail)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User Not Found with username or email" + usernameOrEmail)
                );

        return null;//UserPrincipal.create(user);
    }
}
