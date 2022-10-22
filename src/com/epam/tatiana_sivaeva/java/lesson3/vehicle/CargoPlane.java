package com.epam.tatiana_sivaeva.java.lesson3.vehicle;

// CargoPlane - Грузовой самолет

import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;
import com.epam.tatiana_sivaeva.java.lesson3.VehiclePark;
import com.epam.tatiana_sivaeva.java.lesson3.VehicleStateInterface;

public class CargoPlane extends Vehicle implements VehicleStateInterface {
    public CargoPlane(String name, String licensePlate, Color color, Integer passengers, Integer yearOfManufacture, VehicleState vehicleState) {
        super(name, licensePlate, color, passengers, yearOfManufacture, vehicleState);
    }

    @Override
    public void honk() {
        System.out.println("CargoPlane honk: uiiuiiiuiiiu");
    }


    @Override
    public void changeVehicleState() {
        setVehicleState(VehicleState.FLIGHT);
        System.out.println("CargoPlane is FLIGHT.");
    }
    class InnerCargoPlane{
        void display(){
           // System.out.println("InnerCargoPlane" + Vehicle);
        }
    }
}
