package com.backend.gamerdirectoryservice.database.model;

public enum Level {
    INVINCIBLE, PRO, NOOB;

    public static Level fromString(String level) {
        try {
            return Level.valueOf(level.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid level: " + level);
        }
    }
}
