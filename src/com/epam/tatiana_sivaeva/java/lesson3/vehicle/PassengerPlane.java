package com.epam.tatiana_sivaeva.java.lesson3.vehicle;

// PassengerPlane - пассажирский самолет

import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;
import com.epam.tatiana_sivaeva.java.lesson3.VehicleStateInterface;

public class PassengerPlane extends Vehicle implements VehicleStateInterface {

    public PassengerPlane(String name, String licensePlate, Color color, Integer passengers, Integer yearOfManufacture, VehicleState vehicleState) {
        super(name, licensePlate, color, passengers, yearOfManufacture, vehicleState);
    }

    @Override
    public void honk() {
        System.out.println("PassengerPlane honk: DancingDancingEveryoneOnBoard");
    }

    @Override
    public void changeVehicleState() {
        setVehicleState(VehicleState.FLIGHT);
        System.out.println("PassengerPlane is FLIGHT.");
    }
}

