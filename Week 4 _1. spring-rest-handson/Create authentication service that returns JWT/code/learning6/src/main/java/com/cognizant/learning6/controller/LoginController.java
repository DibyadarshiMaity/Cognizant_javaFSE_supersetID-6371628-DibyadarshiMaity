package com.cognizant.learning6.controller;
import com.cognizant.learning6.model.LoginRequest;
import com.cognizant.learning6.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationManager authMgr;

    @Autowired
    private JwtUtil objJwt;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest obj) {
        authMgr.authenticate(new UsernamePasswordAuthenticationToken(obj.getUsername(), obj.getPassword()));
        return objJwt.createToken(obj.getUsername());
    }
}

