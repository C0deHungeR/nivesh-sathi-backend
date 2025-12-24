package com.hackathon.NiveshSathi.controller;

import com.hackathon.NiveshSathi.dto.LoginRequest;
import com.hackathon.NiveshSathi.dto.SignupRequest;
import com.hackathon.NiveshSathi.entity.User;
import com.hackathon.NiveshSathi.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public User signup(@RequestBody SignupRequest request) {
        return authService.signup(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}
