package com.backend.gamerdirectoryservice.api.service;

import com.backend.gamerdirectoryservice.api.dto.GameDetailDto;
import com.backend.gamerdirectoryservice.api.dto.GamerDto;
import com.backend.gamerdirectoryservice.database.model.GameAssignment;
import com.backend.gamerdirectoryservice.database.model.Gamer;
import com.backend.gamerdirectoryservice.database.model.Geography;
import com.backend.gamerdirectoryservice.database.repo.GamerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GamerService {

    private final GamerRepo gamerRepo;

    public List<GamerDto> getAllGamers() {
        List<Gamer> gamers = gamerRepo.findAll();
        return gamers.stream().map(this::mapGamerToDto).toList();
    }

    public List<GamerDto> getAllGamersByGeography(String geography) {
        List<Gamer> gamers = gamerRepo.findByGeography(getGeography(geography));
        return gamers.stream().map(this::mapGamerToDto).toList();
    }

    private Geography getGeography(String geography) {
        return Geography.valueOf(geography.toUpperCase());
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
