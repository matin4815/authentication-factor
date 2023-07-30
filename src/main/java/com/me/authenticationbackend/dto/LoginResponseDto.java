package com.me.authenticationbackend.dto;

import com.me.authenticationbackend.dal.entity.User;
import lombok.Data;

@Data
public class LoginResponseDto {

    private User user;

    private String jwt;

    public LoginResponseDto(User user, String token) {
    }
}
