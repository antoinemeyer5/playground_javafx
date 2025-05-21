package model;

public record Boat(
    String name,
    Float length,       // meters
    Float width,        // meters
    Integer tonnage,    // tons
    Integer crew        // men
) { }


