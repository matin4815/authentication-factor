package com.me.authenticationbackend.controller;

import com.me.authenticationbackend.dto.AuthenticationResponse;
import com.me.authenticationbackend.dto.LoginDto;
import com.me.authenticationbackend.dto.LoginResponseDto;
import com.me.authenticationbackend.dto.RegisterRequestDto;
import com.me.authenticationbackend.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequestDto request) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody LoginDto loginDto) {
        return ResponseEntity.ok(authenticationService.login(loginDto));

    }
}
