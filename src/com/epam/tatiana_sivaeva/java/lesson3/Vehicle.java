package com.epam.tatiana_sivaeva.java.lesson3;

import java.util.Objects;

public abstract class Vehicle {

    private String name;
    private String licensePlate;
    private Color color;
    private Integer passengers;
    private final Integer yearOfManufacture;
    private VehicleState vehicleState;


    protected Vehicle(String name, String licensePlate, Color color, Integer passengers, Integer yearOfManufacture, VehicleState vehicleState) {
        this.name = name;
        this.licensePlate = licensePlate;
        this.color = color;
        this.passengers = passengers;
        this.yearOfManufacture = yearOfManufacture;
        this.vehicleState = vehicleState;

    }

    public String getName() {
        return name;
    }

    public VehicleState getVehicleState() {
        return vehicleState;
    }

    public void setVehicleState(VehicleState vehicleState) {
        this.vehicleState = vehicleState;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
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

    public enum VehicleState {REPAIR, FLIGHT, PARKING}


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", colore='" + color + '\'' +
                ", passengers=" + passengers +
                ", yearOfManufacture=" + yearOfManufacture +
                ", vehicleState=" + vehicleState +
                '}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return getName().equals(vehicle.getName()) && getLicensePlate().equals(vehicle.getLicensePlate()) &&
                getColor() == vehicle.getColor() && getPassengers().equals(vehicle.getPassengers()) &&
                getYearOfManufacture().equals(vehicle.getYearOfManufacture()) &&
                getVehicleState() == vehicle.getVehicleState();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassengers(), getYearOfManufacture());
    }
}
