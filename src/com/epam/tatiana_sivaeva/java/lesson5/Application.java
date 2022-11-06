package com.epam.tatiana_sivaeva.java.lesson5;


import com.epam.tatiana_sivaeva.java.lesson5.vehicleN.CargoPlaneN;

public class Application {
    public static void main(String[] args) {

        VehicleParkN vehicleParkN = new VehicleParkN();
        String vehicleParkToString = vehicleParkN.getvehiclesPark().toString();
        System.out.println(vehicleParkToString);

        //Inner Honk for CargoPlaneN

        CargoPlaneN.honkNInner honkNInner = new CargoPlaneN.honkNInner();
    }
}

