package com.epam.tatiana_sivaeva.java.lesson3;

public abstract class Vehicle {

    public String getName() {
        return name;
    }

    public String name;
    public String licensePlate;
    public Color color;
    public Integer passengers;
    public Integer yearOfManufacture;


    protected Vehicle(String name, String licensePlate, Color color, Integer passengers, Integer yearOfManufacture) {
        this.name = name;
        this.licensePlate = licensePlate;
        this.color = color;
        this.passengers = passengers;
        this.yearOfManufacture = yearOfManufacture;
    }

    public abstract void honk();

    public String getLicensePlate() {
        return licensePlate;
    }

    public Color getColor() {
        return color;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }

    public enum Color {YELLOW, RED, GREEN, BLUE, GRAY, CYAN, BLACK, MAGENTA}


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", colore='" + color + '\'' +
                ", passengers=" + passengers +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
