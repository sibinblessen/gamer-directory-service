-- Insert initial gamers
INSERT INTO gamer (name, email, geography) VALUES ('John Doe', 'john@example.com', 'EU');
INSERT INTO gamer (name, email, geography) VALUES ('Alice Smith', 'alice@example.com', 'EU');
INSERT INTO gamer (name, email, geography) VALUES ('Bob Johnson', 'bob@example.com', 'NA');
INSERT INTO gamer (name, email, geography) VALUES ('Emily Davis', 'emily@example.com', 'NA');
INSERT INTO gamer (name, email, geography) VALUES ('Michael Brown', 'michael@example.com', 'SA');
INSERT INTO gamer (name, email, geography) VALUES ('Sarah Wilson', 'sarah@example.com', 'SA');
INSERT INTO gamer (name, email, geography) VALUES ('David Martinez', 'david@example.com', 'SEA');
INSERT INTO gamer (name, email, geography) VALUES ('Jessica Thompson', 'jessica@example.com', 'SEA');
INSERT INTO gamer (name, email, geography) VALUES ('Christopher Lee', 'chris@example.com', 'MEA');
INSERT INTO gamer (name, email, geography) VALUES ('Olivia Garcia', 'olivia@example.com', 'MEA');

-- Insert initial games
INSERT INTO game (name, genre) VALUES ('Fortnite', 'Battle Royale');
INSERT INTO game (name, genre) VALUES ('Minecraft', 'Sandbox');
INSERT INTO game (name, genre) VALUES ('Apex Legends', 'Battle Royale');
INSERT INTO game (name, genre) VALUES ('Counter-Strike: Global Offensive', 'First-Person Shooter');
INSERT INTO game (name, genre) VALUES ('League of Legends', 'MOBA');
INSERT INTO game (name, genre) VALUES ('Overwatch', 'First-Person Shooter');

-- Insert initial game assignments
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (1, 1, 'INVINCIBLE');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (1, 3, 'INVINCIBLE');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (1, 4, 'PRO');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (1, 6, 'INVINCIBLE');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (2, 2, 'NOOB');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (3, 3, 'NOOB');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (4, 4, 'PRO');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (5, 5, 'NOOB');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (6, 6, 'PRO');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (7, 3, 'NOOB');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (8, 4, 'PRO');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (9, 5, 'NOOB');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (10, 6, 'PRO');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (2, 4, 'PRO');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (3, 5, 'PRO');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (4, 6, 'INVINCIBLE');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (5, 3, 'PRO');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (6, 4, 'NOOB');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (7, 5, 'PRO');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (8, 6, 'NOOB');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (9, 3, 'PRO');
INSERT INTO game_assignment (gamer_id, game_id, level) VALUES (10, 4, 'NOOB');

