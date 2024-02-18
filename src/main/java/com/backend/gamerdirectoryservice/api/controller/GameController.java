package com.backend.gamerdirectoryservice.api.controller;

import com.backend.gamerdirectoryservice.api.dto.GameDto;
import com.backend.gamerdirectoryservice.api.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping
    public List<GameDto> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public GameDto getGameById(Long id) {
        return gameService.getGameDtoById(id);
    }
}
