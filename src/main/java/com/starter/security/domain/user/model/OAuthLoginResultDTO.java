package com.starter.security.domain.user.model;

public record OAuthLoginResultDTO(
        String accessToken,
        String refreshToken,
        boolean isNewUser,
        boolean needsNickname,
        String username,
        String email,
        String nickname
) {
}
