package com.epam.tatiana_sivaeva.java.lesson5.vehicleN;

//LifeSavingPlane - спасательный

import com.epam.tatiana_sivaeva.java.lesson5.VehicleN;


public class LifeSavingPlaneN extends VehicleN {
    public LifeSavingPlaneN(String name, String licensePlate, Color color, Integer passengers, Integer yearOfManufacture, VehicleState vehicleState) {
        super(name, licensePlate, color, passengers, yearOfManufacture, vehicleState);
    }

    @Override
    public void honk() {
        System.out.println("LifeSavingPlane honk: tutuRutututu");
    }


}
