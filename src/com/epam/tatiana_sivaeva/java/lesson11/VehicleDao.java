package com.epam.tatiana_sivaeva.java.lesson11;

import com.epam.tatiana_sivaeva.java.lesson11.connection.Connection;
import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;
import com.epam.tatiana_sivaeva.java.lesson3.VehiclePark;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.CargoPlane;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.LifeSavingPlane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class VehicleDao implements Dao {
    @Override
    public CargoPlane get(int id) {
        String sql = "SELECT * FROM test_db.cargo_plane WHERE id=?";
        CargoPlane cargoPlane = null;

        try (PreparedStatement statement = Connection.getConnection().prepareStatement(sql)) {

            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                cargoPlane = new CargoPlane(
                        resultSet.getString(2).trim(),
                        resultSet.getString(3).trim(),
                        Enum.valueOf(Vehicle.Color.class, resultSet.getString(4).trim()),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        Enum.valueOf(Vehicle.VehicleState.class, resultSet.getString(7).trim()),
                        resultSet.getString(8).trim());
            }
            resultSet.close();

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();

        return cargoPlane;
    }

    @Override
    public CargoPlane get(int id, String name) {
        String sql = "SELECT * FROM test_db.cargo_plane WHERE id=? and name=? ";
        CargoPlane cargoPlane = null;

        try (PreparedStatement statement = Connection.getConnection().prepareStatement(sql)) {

            statement.setInt(1, id);
            statement.setString(2, name);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                cargoPlane = new CargoPlane(
                        resultSet.getString(2).trim(),
                        resultSet.getString(3).trim(),
                        Enum.valueOf(Vehicle.Color.class, resultSet.getString(4).trim()),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        Enum.valueOf(Vehicle.VehicleState.class, resultSet.getString(7).trim()),
                        resultSet.getString(8).trim());
            }
            resultSet.close();

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();

        return cargoPlane;
    }

    @Override
    public List<VehicleParkDB> getall() {
        List<VehicleParkDB> vehicleParkDBList = new ArrayList<>();

        String sql = "SELECT * FROM test_db.vehicle_list";
        //  String sql1 = "SELECT * FROM test_db.life_saving_plane";

        try (Statement statement = Connection.getConnection().createStatement()) {

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                vehicleParkDBList.add(new VehicleParkDB(
                        resultSet.getString(2).trim(),
                        resultSet.getString(3).trim(),
                        Enum.valueOf(Vehicle.Color.class, resultSet.getString(4).trim()),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        Enum.valueOf(Vehicle.VehicleState.class, resultSet.getString(7).trim()),
                        resultSet.getString(8).trim()));
            }
            resultSet.close();

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();

        return vehicleParkDBList;
    }

    @Override
    public void add(Object object) {

    }

    public void add(CargoPlane cargoPlane) {
        String sql = "INSERT INTO test_db.cargo_plane (idcargo_plane,name,licensePlate,color," +
                "passengers,yearOfManufacture,vehicleState) VALUES(?,?,?,?,?,?,?)";

        try (PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(sql)) {

            preparedStatement.setString(2, cargoPlane.getName());
            preparedStatement.setString(3, cargoPlane.getLicensePlate());
            preparedStatement.setString(4, String.valueOf(cargoPlane.getColor()));
            preparedStatement.setInt(5, cargoPlane.getPassengers());
            preparedStatement.setInt(6, cargoPlane.getYearOfManufacture());
            preparedStatement.setString(7, String.valueOf(cargoPlane.getVehicleState()));

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();

    }

    @Override
    public void add() {

        try (Statement statement = Connection.getConnection().createStatement()) {

            statement.executeUpdate("INSERT INTO test_db.cargo_plane (idcargo_plane,name,licensePlate,color," +
                    "passengers,yearOfManufacture,vehicleState) VALUES('5','CargoPlane: Rhinoceros beetle2','C222B'," +
                    "'BLUE','122','1992','REPAIR')");

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();

    }
}
