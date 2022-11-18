package com.epam.tatiana_sivaeva.java.lesson11;

import com.epam.tatiana_sivaeva.java.lesson11.connection.Connection;
import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.CargoPlane;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VehicleParkDB {

    public static void main(String[] args) {

        List<Vehicle> vehicles1 = new ArrayList<>();

        try (Statement statement = Connection.getConnection().createStatement()) {


            String queryAddCargoPlane = "INSERT INTO test_db.cargo_plane (idcargo_plane,name,licensePlate,color,passengers,yearOfManufacture,vehicleState) VALUES(default,'CargoPlane: Rhinoceros beetle5','C555B','BLUE',122,1992,'REPAIR')";
            // ResultSet resultSet = statement.executeQuery(queryAddCargoPlane);

            statement.executeUpdate(queryAddCargoPlane);

            // vehicles1.add();

            //  System.out.println(resultSet);

            String selectCargoPlane = "SELECT * FROM test_db.cargo_plane";
            ResultSet resultSet1 = statement.executeQuery(selectCargoPlane);
//
//
            while (resultSet1.next()) {
                System.out.println(resultSet1.getString(1));
                vehicles1.add(new CargoPlane(
                        resultSet1.getString(2).trim(),
                        resultSet1.getString(3).trim(),
                        resultSet1.getObject(4, Vehicle.Color.class), //.valueOf(Vehicle.Color.BLUE),  //Vehicle.Color.BLUE(),
                        resultSet1.getInt(5),
                        resultSet1.getInt(6),
                        resultSet1.getObject(7, Vehicle.VehicleState.class)));
            }

            System.out.println(vehicles1);

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();
    }
}
