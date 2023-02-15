package com.example.polls.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface SecurityConfigure {
    void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception;

    void configure(HttpSecurity http) throws Exception;
}
