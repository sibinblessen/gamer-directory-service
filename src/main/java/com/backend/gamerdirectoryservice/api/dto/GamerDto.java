package com.backend.gamerdirectoryservice.api.dto;

import java.util.List;

public record GamerDto(Long id, String name, String email, String geography, List<GameDetailDto> games) {
}
