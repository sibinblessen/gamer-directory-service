package com.backend.gamerdirectoryservice.api.dto;

import java.util.List;

public record GameDto(Long id, String name, String genre, List<GamerDetailsDto> gamers) {
}
