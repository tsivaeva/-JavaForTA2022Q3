package com.epam.tatiana_sivaeva.java.lesson3.vehicle;

import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;

//LifeSavingPlane - спасательный

public class LifeSavingPlane extends Vehicle {
    protected LifeSavingPlane(String name, String licensePlate, Color color, Integer passengers, Integer yearOfManufacture) {
        super(name, licensePlate, color, passengers, yearOfManufacture);
    }

    @Override
    public void honk() {

    }
}
