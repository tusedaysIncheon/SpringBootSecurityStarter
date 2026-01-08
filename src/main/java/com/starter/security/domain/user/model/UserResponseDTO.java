package com.starter.security.domain.user.model;

public record UserResponseDTO(String username, Boolean isSocial, String nickname, String email, Boolean needsNickname)  {


}
