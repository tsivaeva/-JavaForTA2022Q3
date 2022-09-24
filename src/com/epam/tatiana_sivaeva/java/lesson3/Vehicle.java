package com.epam.tatiana_sivaeva.java.lesson3;

public abstract class Vehicle {

    private final String licensePlate;
    private final String colore;
    private final Integer passengers;
    private final Integer yearOfManufacture;


    protected Vehicle(String licensePlate, String colore, Integer passengers, Integer yearOfManufacture) {
        this.licensePlate = licensePlate;
        this.colore = colore;
        this.passengers = passengers;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getColore() {
        return colore;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String toString() {
        return "Vehicle {" +
                "licensePlate = " + licensePlate +
                ", yearOfManufacture = " + yearOfManufacture +
                ", passengers = " + passengers +
                "}" + "\n";
    }

}
