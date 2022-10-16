package com.epam.tatiana_sivaeva.java.lesson3;

import com.epam.tatiana_sivaeva.java.lesson3.vehicle.CargoPlane;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.LifeSavingPlane;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.PassengerPlane;

import java.util.ArrayList;
import java.util.List;

public class VehiclePark {
    public List<Vehicle> vehiclesPark;

    public VehiclePark() {
        vehiclesPark = new ArrayList<>();

        CargoPlane cargoPlane1 = new CargoPlane("CargoPlane: Rhinoceros beetle", "C1111B", Vehicle.Color.BLUE, 120, 1990, Vehicle.VehicleState.REPAIR);
        CargoPlane cargoPlane2 = new CargoPlane("CargoPlane: Scarab beetle", "C2222B", Vehicle.Color.BLACK, 100, 1950, Vehicle.VehicleState.REPAIR);

        LifeSavingPlane lifeSavingPlane1 = new LifeSavingPlane("LifeSavingPlane: Vgiik", "L111M", Vehicle.Color.RED, 10, 2000, Vehicle.VehicleState.REPAIR);
        LifeSavingPlane lifeSavingPlane2 = new LifeSavingPlane("LifeSavingPlane: Speed", "L222M", Vehicle.Color.RED, 8, 2001, Vehicle.VehicleState.REPAIR);

        PassengerPlane passengerPlane1 = new PassengerPlane("PassengerPlane: GO home", "P111P", Vehicle.Color.YELLOW, 200, 2010, Vehicle.VehicleState.REPAIR);
        PassengerPlane passengerPlane2 = new PassengerPlane("PassengerPlane: GO home2", "P222P", Vehicle.Color.MAGENTA, 200, 2011, Vehicle.VehicleState.REPAIR);

        passengerPlane2.changeVehicleState();
        lifeSavingPlane2.changeVehicleState();
        cargoPlane2.changeVehicleState();

        vehiclesPark.add(cargoPlane1);
        vehiclesPark.add(cargoPlane2);
        vehiclesPark.add(passengerPlane1);
        vehiclesPark.add(passengerPlane2);
        vehiclesPark.add(lifeSavingPlane1);
        vehiclesPark.add(lifeSavingPlane2);

    }

    public List<Vehicle> getvehiclesPark() {
        return vehiclesPark;
    }

}
