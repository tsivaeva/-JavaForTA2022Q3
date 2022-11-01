package com.epam.tatiana_sivaeva.java.lesson3.menu_options;

import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;
import com.epam.tatiana_sivaeva.java.lesson3.VehiclePark;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.CargoPlane;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.LifeSavingPlane;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.PassengerPlane;

import java.util.Scanner;


public class EnterVehicleMenu {
    public static void main() {

        Scanner scan = new Scanner(System.in);
        VehiclePark vehiclePark = new VehiclePark();
        int k = 0;

        System.out.println("Could you please choose transport model \n" + "Enter the number for one of them: \n" + "1 is CargoPlane \n" + "2 is LifeSavingPlane \n" + "3 is PassengerPlane");
        int createVehicle = scan.nextInt();

        // consumes the dangling newline character
        scan.nextLine();

        System.out.println("Enter name for transport like 'CargoPlane: Scarab beetle'");
        String nameTemp = scan.nextLine();

        System.out.println("Enter licensePlate for transport like 'C2222B'");
        String licensePlateTemp = scan.next();

        System.out.println("Enter colore for transport like {YELLOW, RED, GREEN, BLUE, GRAY, CYAN, BLACK, MAGENTA}");
        Vehicle.Color coloreTemp = Vehicle.Color.valueOf(scan.next());

        System.out.println("Enter number of passengers for transport like '100'");
        int passengersTemp = Integer.parseInt(scan.next());

        System.out.println("Enter nyearOfManufacture for transport like '1950'");
        int yearOfManufactureTemp = Integer.parseInt(scan.next());

        System.out.println("Enter vehicleStateTemp for transport like {REPAIR, FLIGHT, PARKING}");
        Vehicle.VehicleState vehicleStateTemp = Vehicle.VehicleState.valueOf(scan.next());

        CargoPlane tempVehicle = new CargoPlane(nameTemp, licensePlateTemp, coloreTemp, passengersTemp, yearOfManufactureTemp, vehicleStateTemp);

        for (Vehicle vehicle : vehiclePark.vehiclesParkList) {

            if (vehicle.hashCode() == tempVehicle.hashCode() &&  (vehicle.equals(tempVehicle))) {
                    k = k + 1;
                }
        }

        if (k == 0) {
            if (createVehicle == 1) {

                CargoPlane cargoPlane3 = new CargoPlane(nameTemp, licensePlateTemp, coloreTemp, passengersTemp, yearOfManufactureTemp, vehicleStateTemp);
                vehiclePark.getvehiclesPark().add(cargoPlane3);
                System.out.println("cargoPlane with LicensePlate = " + cargoPlane3.getLicensePlate() + " is added.");

            } else if (createVehicle == 2) {
                LifeSavingPlane lifeSavingPlane3 = new LifeSavingPlane(nameTemp, licensePlateTemp, coloreTemp, passengersTemp, yearOfManufactureTemp, vehicleStateTemp);
                vehiclePark.getvehiclesPark().add(lifeSavingPlane3);
                System.out.println("lifeSavingPlane with LicensePlate = " + lifeSavingPlane3.getLicensePlate() + "  is added.");

            } else if (createVehicle == 3) {
                PassengerPlane passengerPlane3 = new PassengerPlane(nameTemp, licensePlateTemp, coloreTemp, passengersTemp, yearOfManufactureTemp, vehicleStateTemp);
                vehiclePark.getvehiclesPark().add(passengerPlane3);
                System.out.println("passengerPlane with LicensePlate = " + passengerPlane3.getLicensePlate() + " is added.");

            }
            System.out.println("VehiclePark is " + vehiclePark.vehiclesParkList.toString());

        } else
            System.out.println("This Vehicle is already added");

    }

}