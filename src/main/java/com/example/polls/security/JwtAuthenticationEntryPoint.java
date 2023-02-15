package com.example.polls.security;

import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {


    private static final Logger logger =
            (Logger) LoggerFactory.getLogger(JwtAuthenticationEntryPoint.class);





    @Override
    public void commence(HttpServletRequest httpServletRequest,
                         HttpServletResponse httpServletResponse,
                         AuthenticationException e) throws IOException, ServletException {
        logger.info("Responding with unauthorized error. {}");
        httpServletResponse.sendError(HttpServletResponse.SC_ACCEPTED,e.getMessage());

    }
}
