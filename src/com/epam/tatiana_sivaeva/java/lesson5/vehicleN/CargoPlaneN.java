package com.epam.tatiana_sivaeva.java.lesson5.vehicleN;

// CargoPlane - Грузовой самолет

import com.epam.tatiana_sivaeva.java.lesson5.VehicleN;

public class CargoPlaneN extends VehicleN {
    public CargoPlaneN(String name, String licensePlate, Color color, Integer passengers, Integer yearOfManufacture, VehicleState vehicleState) {
        super(name, licensePlate, color, passengers, yearOfManufacture, vehicleState);
    }

    @Override
    public void honk() {
        System.out.println("CargoPlane honk: uiiuiiiuiiiu");
    }

    // Inner class

    public static class honkNInner {
        public honkNInner() {

            System.out.println("Inner class Honk");
        }
    }

}
