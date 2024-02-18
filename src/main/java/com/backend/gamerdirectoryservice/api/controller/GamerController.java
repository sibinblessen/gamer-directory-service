package com.backend.gamerdirectoryservice.api.controller;

import com.backend.gamerdirectoryservice.api.dto.GamerDto;
import com.backend.gamerdirectoryservice.api.service.GamerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gamers")
@RequiredArgsConstructor
public class GamerController {

    private final GamerService gamerService;

    @GetMapping
    public List<GamerDto> getAllGamers() {
        return gamerService.getAllGamers();
    }

    @GetMapping("/geography/{geography}")
    public List<GamerDto> getAllGamersByGeography(@PathVariable String geography) {
        return gamerService.getAllGamersByGeography(geography);
    }

    @GetMapping("game/{gameId}/level/{level}")
    public List<GamerDto> getAllGamersByLevel(@PathVariable Long gameId, @PathVariable String level) {
        return gamerService.getAllGamersByGameIdAndLevel(gameId, level);
    }

    @PostMapping("/link-game")
    public ResponseEntity<String> linkGame(@RequestParam Long gameId,
                                                  @RequestParam Long gamerId,
                                                  @RequestParam String level) {
        gamerService.linkGame(gameId, gamerId, level);
        return ResponseEntity.status(HttpStatus.CREATED).body("Game linked to gamer successfully");
    }

}
