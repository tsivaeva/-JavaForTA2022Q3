package com.epam.tatiana_sivaeva.java.lesson3.menu_options;

import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;
import com.epam.tatiana_sivaeva.java.lesson3.VehiclePark;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UpdateVehicleMenu {

    public static void main() {

        Scanner scan = new Scanner(System.in);
        VehiclePark vehiclePark = new VehiclePark();
        List<Vehicle> vehiclesParkList = vehiclePark.vehiclesParkList;
        List<Vehicle> vehiclesParkListFiltred;

        System.out.println(vehiclesParkList);

        System.out.println("Could you please choose transport for update \n"
                + "Enter the licensePlate \n");

        String updateVehicle = scan.nextLine();

        vehiclesParkListFiltred = vehiclesParkList.stream()
                .filter(Objects::nonNull)
                .filter(vehicle -> vehicle.getLicensePlate().equals(updateVehicle)).collect(Collectors.toList());

        if (!vehiclesParkListFiltred.isEmpty()) {

            System.out.println("Could you please choose parameter \n"
                    + "1 is name \n"
                    + "2 is licensePlate \n"
                    + "3 is colore \n"
                    + "4 is passengers \n"
                    + "5 is vehicleState \n");

            int updateParametr = scan.nextInt();

            // consumes the dangling newline character
            scan.nextLine();

            if (updateParametr == 1) {

                System.out.println("Enter name for transport like 'CargoPlane: butterfly'");
                String nameTemp = scan.nextLine();

                vehiclesParkListFiltred.forEach(vehicle -> vehicle.setName(nameTemp));
                vehiclesParkListFiltred.forEach(System.out::println);

            } else if (updateParametr == 2) {
                System.out.println("Enter licensePlate for transport like 'C0000B'");
                String licensePlateTemp = scan.next();

                vehiclesParkListFiltred.forEach(vehicle -> vehicle.setLicensePlate(licensePlateTemp));
                vehiclesParkListFiltred.forEach(System.out::println);

            } else if (updateParametr == 3) {
                System.out.println("Enter colore for transport like {YELLOW, RED, GREEN, BLUE, GRAY, CYAN, BLACK, MAGENTA}");
                Vehicle.Color coloreTemp = Vehicle.Color.valueOf(scan.next());

                vehiclesParkListFiltred.forEach(vehicle -> vehicle.setColor(coloreTemp));
                vehiclesParkListFiltred.forEach(System.out::println);

            } else if (updateParametr == 4) {
                System.out.println("Enter number of passengers for transport like '11'");
                int passengersTemp = Integer.parseInt(scan.next());

                vehiclesParkListFiltred.forEach(vehicle -> vehicle.setPassengers(passengersTemp));
                vehiclesParkListFiltred.forEach(System.out::println);

            } else if (updateParametr == 5) {
                System.out.println("Enter vehicleStateTemp for transport like {REPAIR, FLIGHT, PARKING}");
                Vehicle.VehicleState vehicleStateTemp = Vehicle.VehicleState.valueOf(scan.next());

                vehiclesParkListFiltred.forEach(vehicle -> vehicle.setVehicleState(vehicleStateTemp));
                vehiclesParkListFiltred.forEach(System.out::println);

            } else {
                System.out.println("Vehicle park does not have parametr with number " + updateParametr);
            }

        } else {
            System.out.println("Vehicle park does not have transtort with number  " + updateVehicle);
        }
    }
}