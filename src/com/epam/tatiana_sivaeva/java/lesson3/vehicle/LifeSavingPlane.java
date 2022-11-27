package com.epam.tatiana_sivaeva.java.lesson3.vehicle;

//LifeSavingPlane - спасательный

import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;
import com.epam.tatiana_sivaeva.java.lesson3.VehicleStateInterface;

public class LifeSavingPlane extends Vehicle implements VehicleStateInterface {
    public LifeSavingPlane(String name, String licensePlate, Color color, Integer passengers, Integer yearOfManufacture, VehicleState vehicleState, String vehicleType) {
        super(name, licensePlate, color, passengers, yearOfManufacture, vehicleState, vehicleType);
    }

       @Override
    public void changeVehicleState() {
        setVehicleState(VehicleState.FLIGHT);
        System.out.println("LifeSavingPlane is FLIGHT.");
    }
}
