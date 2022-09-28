package com.epam.tatiana_sivaeva.java.lesson3;

import com.epam.tatiana_sivaeva.java.lesson3.vehicle.CargoPlane;
import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehiclePark {

    private List<Vehicle> vehiclesPark;

    public VehiclePark() {
        vehiclesPark = new ArrayList<>();
        CargoPlane CargoPlane1 = new CargoPlane("Rhinoceros beetle", "A12354B", Vehicle.Color.BLUE, 120, 1990);
        CargoPlane CargoPlane2 = new CargoPlane("Scarab beetle","D5557B", Vehicle.Color.BLACK,100,1950);


        vehiclesPark.add(CargoPlane1);
        vehiclesPark.add(CargoPlane2);

       // vehiclesPark.toString();
        System.out.println(vehiclesPark);
    }


}
