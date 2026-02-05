package com.javawebken.mystore.dto;

public record LoginResponseDto(String message, UserDto user, String jwtToken) {
}
