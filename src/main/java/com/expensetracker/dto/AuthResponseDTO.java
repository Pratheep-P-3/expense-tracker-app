package com.expensetracker.dto;

import java.time.LocalDateTime;

public class AuthResponseDTO {

    private Long userId;
    private String username;
    private String email;
    private LocalDateTime createdAt;
    private String token;

    // Constructors
    public AuthResponseDTO() {
    }

    public AuthResponseDTO(Long userId, String username, String email, LocalDateTime createdAt, String token) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.createdAt = createdAt;
        this.token = token;
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
