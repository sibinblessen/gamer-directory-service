package com.backend.gamerdirectoryservice.api.service;

import com.backend.gamerdirectoryservice.database.model.Game;
import com.backend.gamerdirectoryservice.database.model.GameAssignment;
import com.backend.gamerdirectoryservice.database.model.Gamer;
import com.backend.gamerdirectoryservice.database.model.Level;
import com.backend.gamerdirectoryservice.database.repo.GameAssignmentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameAssignmentService {

    private final GameAssignmentRepo gameAssignmentRepo;

    public void saveGameAssignment(Gamer gamer, Game game, Level level) {
        GameAssignment gameAssignment = new GameAssignment();
        gameAssignment.setGame(game);
        gameAssignment.setGamer(gamer);
        gameAssignment.setLevel(level);
        gameAssignmentRepo.save(gameAssignment);
    }
}
