package com.expensetracker.controller;

import com.expensetracker.dto.AuthResponseDTO;
import com.expensetracker.dto.LoginRequestDTO;
import com.expensetracker.dto.UserRequestDTO;
import com.expensetracker.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    /**
     * Endpoint for user registration
     * POST /auth/signup
     * Returns user details with JWT token
     */
    @PostMapping("/signup")
    public ResponseEntity<AuthResponseDTO> signup(@RequestBody UserRequestDTO userRequestDTO) {
        AuthResponseDTO responseDTO = authService.signup(userRequestDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    /**
     * Endpoint for user login
     * POST /auth/login
     * Returns user details with JWT token
     */
    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO) {
        AuthResponseDTO responseDTO = authService.login(loginRequestDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
