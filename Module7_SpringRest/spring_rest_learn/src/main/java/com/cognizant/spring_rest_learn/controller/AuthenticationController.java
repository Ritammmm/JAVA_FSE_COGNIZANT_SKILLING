package com.cognizant.spring_rest_learn.controller;

import com.cognizant.spring_rest_learn.model.AuthenticationRequest;
import com.cognizant.spring_rest_learn.model.AuthenticationResponse;
import com.cognizant.spring_rest_learn.util.JwtUtil;

import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestBody AuthenticationRequest request) {

        if ("admin".equals(request.getUsername())
                && "admin".equals(request.getPassword())) {

            String token = JwtUtil.generateToken(request.getUsername());

            return new AuthenticationResponse(token);
        }

        return new AuthenticationResponse("Invalid Credentials");
    }
}