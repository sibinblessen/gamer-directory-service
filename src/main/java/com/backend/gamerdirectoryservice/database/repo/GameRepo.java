package com.backend.gamerdirectoryservice.database.repo;

import com.backend.gamerdirectoryservice.database.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepo extends JpaRepository<Game, Long> {
}
