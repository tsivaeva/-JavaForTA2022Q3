package com.epam.tatiana_sivaeva.java.lesson11;

import com.epam.tatiana_sivaeva.java.lesson11.connection.Connection;

import java.sql.SQLException;
import java.sql.Statement;

public class VehicleCreateDB {

    public void createTables() {

        try (Statement statement = Connection.getConnection().createStatement()) {
            String sqlVehicleType = "CREATE TABLE IF NOT EXISTS `test_db`.`vehicle_type`(" +
                    "`id_VehicleType` INT NOT NULL AUTO_INCREMENT," +
                    "`vehicleType` VARCHAR(45) NOT NULL UNIQUE," +
                    "PRIMARY KEY (`Id_VehicleType`));";


            String sqlVehicles = "CREATE TABLE IF NOT EXISTS `test_db`.`vehicle_list` (" +
                    "  `id_vehicle_list` INT NOT NULL AUTO_INCREMENT," +
                    "  `name` VARCHAR(45) NOT NULL," +
                    "  `licensePlate` VARCHAR(45) NOT NULL UNIQUE," +
                    "  `color` VARCHAR(45) NOT NULL," +
                    "  `passengers` INT NOT NULL," +
                    "  `yearOfManufacture` INT NOT NULL," +
                    "  `vehicleState` VARCHAR(45) NOT NULL," +
                    "  `vehicleType` VARCHAR(45) NOT NULL," +
                    "    PRIMARY KEY (`id_vehicle_list`)," +
                    "    FOREIGN KEY (`vehicleType`)  REFERENCES `test_db`.`vehicle_type`(`vehicleType`))";


            statement.executeUpdate(sqlVehicleType);
            System.out.println("VehicleType is created");
            statement.executeUpdate(sqlVehicles);
            System.out.println("Vehicles is created");

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();
    }
}

