package com.epam.tatiana_sivaeva.java.lesson5;

import com.epam.tatiana_sivaeva.java.lesson5.vehicleN.CargoPlaneN;
import com.epam.tatiana_sivaeva.java.lesson5.vehicleN.LifeSavingPlaneN;
import com.epam.tatiana_sivaeva.java.lesson5.vehicleN.PassengerPlaneN;

import java.util.ArrayList;
import java.util.List;

public class VehicleParkN {
    public List<VehicleN> vehiclesParkNList;

    public VehicleParkN() {
        vehiclesParkNList = new ArrayList<>();

        CargoPlaneN cargoPlaneN1 = new CargoPlaneN("CargoPlane: Rhinoceros beetle", "C1111B", VehicleN.Color.BLUE, 120, 1990, VehicleN.VehicleState.REPAIR);
        CargoPlaneN cargoPlaneN2 = new CargoPlaneN("CargoPlane: Scarab beetle", "C2222B", VehicleN.Color.BLACK, 100, 1950, VehicleN.VehicleState.REPAIR);

        LifeSavingPlaneN lifeSavingPlaneN1 = new LifeSavingPlaneN("LifeSavingPlane: Vgiik", "L111M", VehicleN.Color.RED, 10, 2000, VehicleN.VehicleState.REPAIR);
        LifeSavingPlaneN lifeSavingPlaneN2 = new LifeSavingPlaneN("LifeSavingPlane: Speed", "L222M", VehicleN.Color.RED, 8, 2001, VehicleN.VehicleState.REPAIR);

        PassengerPlaneN passengerPlaneN1 = new PassengerPlaneN("PassengerPlane: GO home", "P111P", VehicleN.Color.YELLOW, 200, 2010, VehicleN.VehicleState.REPAIR);
        PassengerPlaneN passengerPlaneN2 = new PassengerPlaneN("PassengerPlane: GO home2", "P222P", VehicleN.Color.MAGENTA, 200, 2011, VehicleN.VehicleState.REPAIR);


        vehiclesParkNList.add(cargoPlaneN1);
        vehiclesParkNList.add(cargoPlaneN2);
        vehiclesParkNList.add(passengerPlaneN1);
        vehiclesParkNList.add(passengerPlaneN2);
        vehiclesParkNList.add(lifeSavingPlaneN1);
        vehiclesParkNList.add(lifeSavingPlaneN2);

        VehicleStateChange vehicleStateChange = new VehicleStateChange();
        vehicleStateChange.vehicleStateFLIGHT(0);
        vehicleStateChange.vehicleStateREPAIR(1);
        vehicleStateChange.vehicleStatePARKING(2);

//Анонимный класс для изменения статуса Транспорта
        VehicleStateInterfaceN vehicleStateInterfaceN = new VehicleStateInterfaceN() {
            @Override
            public void changeVehicleStateN() {
                cargoPlaneN1.setVehicleState(VehicleN.VehicleState.FLIGHT);
                System.out.println("Vehicle is FLIGHT.(Anonymous)");
                cargoPlaneN2.setVehicleState(VehicleN.VehicleState.FLIGHT);
                System.out.println("Vehicle is FLIGHT.(Anonymous)");
            }
        };

        vehicleStateInterfaceN.changeVehicleStateN();



    }

    //Созданы Nested классы для изменения статуса Транспорта

    public class VehicleStateChange {

        public void vehicleStateREPAIR(int i) {
            vehiclesParkNList.get(i).setVehicleState(VehicleN.VehicleState.REPAIR);
            System.out.println("Vehicle is REPAIR. (Nested)");

        }

        public void vehicleStateFLIGHT(int i) {
            vehiclesParkNList.get(i).setVehicleState(VehicleN.VehicleState.FLIGHT);
            System.out.println("Vehicle is FLIGHT.(Nested)");

        }

        public void vehicleStatePARKING(int i) {
            vehiclesParkNList.get(i).setVehicleState(VehicleN.VehicleState.PARKING);
            System.out.println("Vehicle is PARKING.(Nested)");

        }
    }

    public List<VehicleN> getvehiclesPark() {
        return vehiclesParkNList;
    }


}
