package com.epam.tatiana_sivaeva.java.lesson3;

import com.epam.tatiana_sivaeva.java.lesson3.vehicle.CargoPlane;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.LifeSavingPlane;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.PassengerPlane;

public class VehiclePark {

    public static void main(String[] args) {


        CargoPlane cargoPlane1 = new CargoPlane("CargoPlane: Rhinoceros beetle", "C1111B", Vehicle.Color.BLUE, 120, 1990, Vehicle.VehicleState.REPAIR);
        CargoPlane cargoPlane2 = new CargoPlane("CargoPlane: Scarab beetle", "C2222B", Vehicle.Color.BLACK, 100, 1950, Vehicle.VehicleState.REPAIR);
        cargoPlane1.changeVehicleState();

        LifeSavingPlane lifeSavingPlane1 = new LifeSavingPlane("LifeSavingPlane: Vgiik", "L111M", Vehicle.Color.RED, 10, 2000, Vehicle.VehicleState.REPAIR);
        LifeSavingPlane lifeSavingPlane2 = new LifeSavingPlane("LifeSavingPlane: Speed", "L222M", Vehicle.Color.RED, 8, 2001, Vehicle.VehicleState.REPAIR);
        lifeSavingPlane1.changeVehicleState();

        PassengerPlane passengerPlane1 = new PassengerPlane("PassengerPlane: GO home", "P111P", Vehicle.Color.YELLOW, 200, 2010, Vehicle.VehicleState.REPAIR);
        PassengerPlane passengerPlane2 = new PassengerPlane("PassengerPlane: GO home2", "P222P", Vehicle.Color.MAGENTA, 200, 2011, Vehicle.VehicleState.REPAIR);
        passengerPlane1.changeVehicleState();

        System.out.println(String.format("%s %s %s %s %s", cargoPlane1.getName(), cargoPlane1.getLicensePlate(), cargoPlane1.getColor(), cargoPlane1.getPassengers(), cargoPlane1.getYearOfManufacture()));
        System.out.println("OR " + cargoPlane1.toString());
        System.out.println(String.format("%s %s %s %s %s", cargoPlane2.getName(), cargoPlane2.getLicensePlate(), cargoPlane2.getColor(), cargoPlane2.getPassengers(), cargoPlane2.getYearOfManufacture()));
        System.out.println("OR " + cargoPlane2.toString());
        cargoPlane1.honk();

        System.out.println(String.format("%s %s %s %s %s", lifeSavingPlane1.getName(), lifeSavingPlane1.getLicensePlate(), lifeSavingPlane1.getColor(), lifeSavingPlane1.getPassengers(), lifeSavingPlane1.getYearOfManufacture()));
        System.out.println("OR " + lifeSavingPlane1.toString());
        System.out.println(String.format("%s %s %s %s %s", lifeSavingPlane2.getName(), lifeSavingPlane2.getLicensePlate(), lifeSavingPlane2.getColor(), lifeSavingPlane2.getPassengers(), lifeSavingPlane2.getYearOfManufacture()));
        System.out.println("OR " + lifeSavingPlane2.toString());
        lifeSavingPlane1.honk();

        System.out.println(String.format("%s %s %s %s %s", passengerPlane1.getName(), passengerPlane1.getLicensePlate(), passengerPlane1.getColor(), passengerPlane1.getPassengers(), passengerPlane1.getYearOfManufacture()));
        System.out.println("OR " + passengerPlane1.toString());
        System.out.println(String.format("%s %s %s %s %s", passengerPlane2.getName(), passengerPlane2.getLicensePlate(), passengerPlane2.getColor(), passengerPlane2.getPassengers(), passengerPlane2.getYearOfManufacture()));
        System.out.println("OR " + passengerPlane2.toString());
        passengerPlane1.honk();
    }


}
