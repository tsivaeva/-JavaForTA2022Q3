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

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MenuDB {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int a;
            System.out.print("Menu has 9 options \n"
                    + "Enter the number for one of them: \n"
                    + "1 is Create tables in DB \n"
                    + "2 is Create insert script to add records \n"
                    + "3 is Create update script to update a value in a record by specific parameter \n"
                    + "4 is Create script to delete records by specific column \n"
                    + "5 is Create script to delete all the records in the table \n"
                    + "-6 is Create script to get records from at able using between \n"
                    + "-+7 is Create script to receive records from all the 3 tables(join)ordered by any column \n"
                    + "8 is Create script to receive amount of records in all the tables \n"
                    + "9 is Create script to use any aggregated function(max passengers)" + "\n");

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
                System.out.print("You can enter Part of transport name for changing passenger number: \n");
                String partName = br.readLine();

                System.out.print("Enter passenger number: \n");

                int updatePassengerNumber = Integer.parseInt(br.readLine());

                String queryUpdatePassengerNumber = "UPDATE `test_db`.`vehicle_list` SET `passengers` = '" + updatePassengerNumber + "' WHERE (`name` LIKE '%" + partName + "%');";

                try (Statement statement = Connection.getConnection().createStatement()) {

                    statement.executeUpdate(queryUpdatePassengerNumber);

                } catch (SQLException e) {
                    System.err.println("Exception during the statement execution" + e);
                }
                Connection.close();

                VehicleDao vehicleDao = new VehicleDao();
                vehicleDao.getall().stream().forEach(System.out::print);

            } else if (a == 4) {
                System.out.print("You can enter Part of transport name for delete all the records in the table: \n");
                String partName = br.readLine();

                String queryDeleteRows = "DELETE FROM `test_db`.`vehicle_list` WHERE (`name` LIKE '%" + partName + "%');";

                try (Statement statement = Connection.getConnection().createStatement()) {

                    statement.executeUpdate(queryDeleteRows);

                } catch (SQLException e) {
                    System.err.println("Exception during the statement execution" + e);
                }
                Connection.close();

                VehicleDao vehicleDao = new VehicleDao();
                vehicleDao.getall().stream().forEach(System.out::print);


            } else if (a == 5) {
//
                String queryDeleteAllRows = "DELETE FROM `test_db`.`vehicle_list`";

                try (Statement statement = Connection.getConnection().createStatement()) {

                    statement.executeUpdate(queryDeleteAllRows);

                } catch (SQLException e) {
                    System.err.println("Exception during the statement execution" + e);
                }
                Connection.close();

                VehicleDao vehicleDao = new VehicleDao();
                vehicleDao.getall().stream().forEach(System.out::print);

            } else if (a == 6) {


                System.out.print("Enter passenger number from: \n");

                int fromPassengerNumber = Integer.parseInt(br.readLine());

                System.out.print("Enter passenger number to: \n");

                int toPassengerNumber = Integer.parseInt(br.readLine());

                VehicleDao vehicleDao = new VehicleDao();
                vehicleDao.getBETWEEN(fromPassengerNumber, toPassengerNumber);
                vehicleDao.getall().stream().forEach(System.out::print);

            } else if (a == 7) {
                //SELECT * FROM `test_db`.`vehicle_list` RIGHT JOIN `test_db`.vehicle_type ON vehicleType_fk =id_VehicleType;

            } else if (a == 8) {

                String querycount = "SELECT count(*) FROM `test_db`.`vehicle_list`";
                int querycountN = 0;

                try (Statement statement = Connection.getConnection().createStatement()) {

                    ResultSet resultSet = statement.executeQuery(querycount);

                    while (resultSet.next()) {
                        querycountN = resultSet.getInt(1);
                    }
                    System.out.println("Count = " + querycountN);

                } catch (SQLException e) {
                    System.err.println("Exception during the statement execution" + e);
                }
                Connection.close();


            } else if (a == 9) {
                //SELECT * FROM test_db.vehicle_list WHERE passengers = (select max(passengers) FROM test_db.vehicle_list)

                String querymax = "SELECT max(passengers) FROM `test_db`.`vehicle_list`";
                int queryMax = 0;

                try (Statement statement = Connection.getConnection().createStatement()) {

                    ResultSet resultSet = statement.executeQuery(querymax);

                    while (resultSet.next()) {
                        queryMax = resultSet.getInt(1);
                    }
                    System.out.println("Max passengers= " + queryMax);

                } catch (SQLException e) {
                    System.err.println("Exception during the statement execution" + e);
                }
                Connection.close();

            } else {
                System.out.println("Incorrect value ");
            }
//
        } catch (
                IOException e) {
            e.printStackTrace();

        }
    }
}

