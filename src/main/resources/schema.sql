-- Create gamer table
CREATE TABLE gamer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

-- Create game table
CREATE TABLE game (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    genre VARCHAR(255) NOT NULL
);

-- Create game_assignment table
CREATE TABLE game_assignment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    gamer_id BIGINT NOT NULL,
    game_id BIGINT NOT NULL,
    level VARCHAR(50),
    FOREIGN KEY (gamer_id) REFERENCES gamer(id),
    FOREIGN KEY (game_id) REFERENCES game(id)
);

-- Create geography table
CREATE TABLE geography (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    country VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL
);
