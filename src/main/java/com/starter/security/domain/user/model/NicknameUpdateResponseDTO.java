package com.starter.security.domain.user.model;

public record NicknameUpdateResponseDTO(
        String nickname,
        boolean needsNickname
) {
}
