package com.expensetracker.service;

import com.expensetracker.dto.AuthResponseDTO;
import com.expensetracker.dto.LoginRequestDTO;
import com.expensetracker.dto.UserRequestDTO;

public interface AuthService {

    AuthResponseDTO signup(UserRequestDTO userRequestDTO);

    AuthResponseDTO login(LoginRequestDTO loginRequestDTO);
}
