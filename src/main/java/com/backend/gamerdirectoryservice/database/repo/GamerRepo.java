package com.backend.gamerdirectoryservice.database.repo;

import com.backend.gamerdirectoryservice.database.model.Gamer;
import com.backend.gamerdirectoryservice.database.model.Geography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GamerRepo extends JpaRepository<Gamer, Long> {
    List<Gamer> findByGeography(Geography geography);
}
