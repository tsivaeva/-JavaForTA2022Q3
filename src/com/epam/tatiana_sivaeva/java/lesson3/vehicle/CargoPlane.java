package com.epam.tatiana_sivaeva.java.lesson3.vehicle;

import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;

// CargoPlane - Грузовой самолет

public class CargoPlane extends Vehicle {
    public CargoPlane(String name, String licensePlate, Color color, Integer passengers, Integer yearOfManufacture) {
        super(name, licensePlate, color, passengers, yearOfManufacture);
    }

    @Override
    public void honk() {
        System.out.println("CargoPlane: uiiuiiiuiiiu");
    }
}
