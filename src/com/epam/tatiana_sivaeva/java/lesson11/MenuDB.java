package com.epam.tatiana_sivaeva.java.lesson11;
//1.Create 3 tables(anydomain)
//        -tables must have at least one numeric column
//        -tables must have at least one string type column
//        -at least one of the tables must have any date time type column
//        -tables must behave references and be logicaly connected together
//2.Create insert script to add records to all the 3 tables
//3.Create update script to update a value in a record by specific parameter
//4.Create script to delete records by specific column
//5.Create script to delete all the records in the table
//6.Create script to get records from at able using between/in/like(in one or in 3 different queries)
//7.Create script to receive records from all the 3 tables(join)ordered by any column
//8.Create script to receive amount of records in all the tables
//9.Create script to use any aggregated function


import com.epam.tatiana_sivaeva.java.lesson11.connection.Connection;
import com.epam.tatiana_sivaeva.java.lesson11.menu_options_DB.VehicleAddRecordsDB;
import com.epam.tatiana_sivaeva.java.lesson11.menu_options_DB.VehicleCreateDB;
import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;

import java.io.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuDB {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int a;
            //  String vehicleParkToString = vehiclePark.getvehiclesPark().toString();
            System.out.print("Menu has 7 options \n"
                    + "Enter the number for one of them: \n"
                    + "+1 is Create tables in DB \n"
                    + "+2 is Create insert script to add records \n"
                    + "3 is Create update script to update a value in a record by specific parameter \n"
                    + "4 is Create script to delete records by specific column \n"
                    + "5 is Create script to delete all the records in the table \n"
                    + "6 is Create script to get records from at able using between/in/like(in one or in 3 different queries) \n"
                    + "7 is Create script to receive records from all the 3 tables(join)ordered by any column \n"
                    + "8 is Create script to receive amount of records in all the tables \n"
                    + "9 is Create script to use any aggregated function" + "\n");

            a = Integer.parseInt(br.readLine());

            if (a == 1) {
                VehicleDao vehicleDao = new VehicleDao();
                VehicleCreateDB vehicleCreateDB = new VehicleCreateDB();
                vehicleCreateDB.createTables();

            } else if (a == 2) {
                VehicleDao vehicleDao = new VehicleDao();
                VehicleAddRecordsDB vehicleAddRecordsDB = new VehicleAddRecordsDB();
                vehicleAddRecordsDB.addRecords();

                vehicleDao.getall().stream().forEach(System.out::print);

            } else if (a == 3) {
                System.out.print("You can enter Part of transport name for changing passenger number");
                String $partName = br.readLine();

                System.out.print("You can enter Part of transport name for changing passenger number");

                Integer $updatePassengerNumber = Integer.parseInt(br.readLine());

                String queryUpdatePassengerNumber = "UPDATE `test_db`.`vehicle_list` SET `passengers` = '.$updatePassengerNumber.' WHERE (`name` LIKE '%.$partName.%');";
                try (Statement statement = Connection.getConnection().createStatement()) {

                    statement.executeUpdate(queryUpdatePassengerNumber);

                } catch (SQLException e) {
                    System.err.println("Exception during the statement execution" + e);
                }
                Connection.close();

            } else if (a == 4) {
//                RemoveVehicleMenu.main();
//
            } else if (a == 5) {
//                System.out.println("All objects from collection \n" + vehiclePark.vehiclesParkList);
//
            } else if (a == 6) {
//                UpdateVehicleMenu.main();
//
            } else if (a == 7) {
//                System.exit(0);
//
            } else {
                System.out.println("Incorrect value ");
            }
//
        } catch (IOException e) {
            e.printStackTrace();
//        } catch (InvalidAException invalidAException) {
//            System.err.println("invalidAException:  " + invalidAException.getMessage());
        }
    }
}

