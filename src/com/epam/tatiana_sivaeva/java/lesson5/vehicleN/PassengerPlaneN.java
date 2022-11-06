package com.epam.tatiana_sivaeva.java.lesson5.vehicleN;

// PassengerPlane - пассажирский самолет

import com.epam.tatiana_sivaeva.java.lesson5.VehicleN;

public class PassengerPlaneN extends VehicleN {

    public PassengerPlaneN(String name, String licensePlate, Color color, Integer passengers, Integer yearOfManufacture, VehicleState vehicleState) {
        super(name, licensePlate, color, passengers, yearOfManufacture, vehicleState);
    }

    @Override
    public void honk() {
        System.out.println("PassengerPlane honk: DancingDancingEveryoneOnBoard");
    }

}

