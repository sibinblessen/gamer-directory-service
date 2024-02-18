package com.backend.gamerdirectoryservice.api.service;

import com.backend.gamerdirectoryservice.api.dto.GameDetailDto;
import com.backend.gamerdirectoryservice.api.dto.GamerDto;
import com.backend.gamerdirectoryservice.database.model.*;
import com.backend.gamerdirectoryservice.database.repo.GamerRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GamerService {

    private final GamerRepo gamerRepo;

    private final GameService gameService;

    private final GameAssignmentService gameAssignmentService;

    public List<GamerDto> getAllGamers() {
        List<Gamer> gamers = gamerRepo.findAll();
        return gamers.stream().map(this::mapGamerToDto).toList();
    }

    public List<GamerDto> getAllGamersByGameIdAndLevel(Long gameId, String level) {
        List<Gamer> gamers = gamerRepo.findByGames_Game_IdAndGames_Level(gameId, Level.fromString(level));
        return gamers.stream().map(this::mapGamerToDto).toList();
    }

    public List<GamerDto> getAllGamersByGeography(String geography) {
        List<Gamer> gamers = gamerRepo.findByGeography(Geography.fromString(geography));
        return gamers.stream().map(this::mapGamerToDto).toList();
    }

    public void linkGame(Long gameId, Long gamerId, String levelString) {
        Gamer gamer = getGamerById(gamerId);
        Game game = gameService.getGameById(gameId);
        Level level = Level.fromString(levelString);
        gameAssignmentService.saveGameAssignment(gamer, game, level);
    }

    protected Gamer getGamerById(Long id) {
        return gamerRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Gamer not found with id: " + id));
    }

    private GamerDto mapGamerToDto(Gamer gamer) {

        List<GameDetailDto> games = gamer.getGames().stream().map(this::mapGameAssignmentToGameDetailsDto).toList();

        return new GamerDto(
                gamer.getId(),
                gamer.getName(),
                gamer.getEmail(),
                gamer.getGeography().name(),
                games
        );
    }

    private GameDetailDto mapGameAssignmentToGameDetailsDto(GameAssignment gameAssignment) {
        return new GameDetailDto(
                gameAssignment.getGame().getName(),
                gameAssignment.getGame().getGenre(),
                gameAssignment.getLevel().name()
        );
    }
}
