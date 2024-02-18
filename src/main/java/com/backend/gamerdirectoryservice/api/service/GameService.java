package com.backend.gamerdirectoryservice.api.service;

import com.backend.gamerdirectoryservice.api.dto.GameDto;
import com.backend.gamerdirectoryservice.api.dto.GamerDetailsDto;
import com.backend.gamerdirectoryservice.database.model.Game;
import com.backend.gamerdirectoryservice.database.model.GameAssignment;
import com.backend.gamerdirectoryservice.database.repo.GameRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepo gameRepo;

    public List<GameDto> getAllGames() {
        List<Game> games = gameRepo.findAll();
        return games.stream().map(this::mapGameToDto).toList();
    }

    protected Game getGameById(Long id) {
        return gameRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Game not found with id: " + id));
    }

    public GameDto getGameDtoById(Long id) {
        return mapGameToDto(getGameById(id));
    }

    private GameDto mapGameToDto(Game game) {

        List<GamerDetailsDto> gamers = game.getGamers().stream().map(this::mapGameAssignmentToGamerDetailsDto).toList();
        return new GameDto(
                game.getId(),
                game.getName(),
                game.getGenre(),
                gamers
        );
    }

    private GamerDetailsDto mapGameAssignmentToGamerDetailsDto(GameAssignment gameAssignment) {
        return new GamerDetailsDto(
                gameAssignment.getGamer().getName(),
                gameAssignment.getGamer().getEmail(),
                gameAssignment.getGamer().getGeography().name(),
                gameAssignment.getLevel().name()
        );
    }
}
