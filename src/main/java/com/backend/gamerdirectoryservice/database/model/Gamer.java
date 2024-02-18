package com.backend.gamerdirectoryservice.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Gamer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    @Enumerated(EnumType.STRING)
    private Geography geography;

    @OneToMany(mappedBy = "gamer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<GameAssignment> games;
}
