package com.starter.security.domain.user.model;

public record AuthLoginResponseDTO(
        String accessToken,
        UserResponseDTO user
) {
}
