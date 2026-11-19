package com.klu.controller;

import com.klu.service.JwtService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class JwtController {

    private final JwtService jwtService;

    public JwtController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/generate")
    public String generateToken(@RequestBody Map<String, Object> payload) {

        return jwtService.generateToken(payload);
    }
}