package com.epam.tatiana_sivaeva.java.lesson11.menu_options_DB;

import com.epam.tatiana_sivaeva.java.lesson11.VehicleParkDB;
import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;

import java.util.Scanner;

public class EnterVehicleDB {

    public static Object main() {

        Scanner scan = new Scanner(System.in);
        String nameTemp;
        String licensePlateTemp;
        Vehicle.Color coloreTemp;
        int passengersTemp;
        int yearOfManufactureTemp;
        Vehicle.VehicleState vehicleStateTemp;
        int vehicleType;

        int k = 0;

        System.out.println("You can add Vehicle to DB");

        // consumes the dangling newline character
//    scan.nextLine();

        System.out.println("Enter name for transport like 'CargoPlane: Scarab beetle'");
        nameTemp = scan.nextLine();

        System.out.println("Enter licensePlate for transport like 'C2222B'. licensePlate is UNIQUE");
        licensePlateTemp = scan.next();

        System.out.println("Enter colore for transport like {YELLOW, RED, GREEN, BLUE, GRAY, CYAN, BLACK, MAGENTA}");
        coloreTemp = Vehicle.Color.valueOf(scan.next());

        System.out.println("Enter number of passengers for transport like '100'");
        passengersTemp = Integer.parseInt(scan.next());

        System.out.println("Enter nyearOfManufacture for transport like '1950'");
        yearOfManufactureTemp = Integer.parseInt(scan.next());

        System.out.println("Enter vehicleStateTemp for transport like {REPAIR, FLIGHT, PARKING}");
        vehicleStateTemp = Vehicle.VehicleState.valueOf(scan.next());

        System.out.println("Enter Type of vehicle for transport where '1' is CargoPlane; '2' is LifeSavingPlane; '3' is PassengerPlane");
        vehicleType = Integer.parseInt(scan.next());

        VehicleParkDB vehicleParkDBEnter = new VehicleParkDB(nameTemp, licensePlateTemp, coloreTemp, passengersTemp, yearOfManufactureTemp, vehicleStateTemp, vehicleType);

        return vehicleParkDBEnter;
    }

}