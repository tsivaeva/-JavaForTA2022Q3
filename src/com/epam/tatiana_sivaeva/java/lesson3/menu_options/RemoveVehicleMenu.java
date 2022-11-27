package com.epam.tatiana_sivaeva.java.lesson3.menu_options;

import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;
import com.epam.tatiana_sivaeva.java.lesson3.VehiclePark;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RemoveVehicleMenu {
    public static void main() {

        Scanner scan = new Scanner(System.in);
        VehiclePark vehiclePark = new VehiclePark();
        List<Vehicle> vehiclesParkList = vehiclePark.vehiclesParkList;
        // удалить вызов методов печати

        System.out.println("Could you please enter licensePlate for removing (for ex. C1111B )   \n"
                + "Full list of the Vehicle will be displayed below: \n"
                + vehiclesParkList);

        String removeVehicleLicensePlate = scan.nextLine();

        if (!vehiclesParkList.isEmpty()) {

            vehiclesParkList.removeIf(vehicle -> Objects.equals(vehicle.getLicensePlate(), removeVehicleLicensePlate));

        } else {
            System.out.println("Vehicles Park List does not have transport with your LicensePlate");
        }
        System.out.println("Vehicle after deleting \n" + vehiclesParkList);
    }
}




