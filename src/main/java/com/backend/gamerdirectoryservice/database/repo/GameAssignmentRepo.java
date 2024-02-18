package com.backend.gamerdirectoryservice.database.repo;

import com.backend.gamerdirectoryservice.database.model.GameAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameAssignmentRepo extends JpaRepository<GameAssignment, Long> {
}
