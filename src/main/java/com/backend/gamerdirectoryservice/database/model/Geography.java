package com.backend.gamerdirectoryservice.database.model;

public enum Geography {
    EU, NA, SA, SEA, MEA;

    public static Geography fromString(String geography) {
        try {
            return Geography.valueOf(geography.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid level: " + geography);
        }
    }
}
