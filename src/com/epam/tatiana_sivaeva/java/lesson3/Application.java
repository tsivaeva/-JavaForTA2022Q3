package com.epam.tatiana_sivaeva.java.lesson3;

public class Application {
    public static void main(String[] args) {

        VehiclePark vehiclePark = new VehiclePark();
        String vehicleParkToString = vehiclePark.getvehiclesPark().toString();
        System.out.println(vehicleParkToString);

        int n = vehiclePark.getvehiclesPark().size();
        for (int i = 0; i < n; i++)
            vehiclePark.getvehiclesPark().get(i).honk();
    }
}

