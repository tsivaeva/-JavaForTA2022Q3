package com.epam.tatiana_sivaeva.java.lesson11;

import com.epam.tatiana_sivaeva.java.lesson11.connection.Connection;
import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;
import com.epam.tatiana_sivaeva.java.lesson3.VehiclePark;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.CargoPlane;
import com.epam.tatiana_sivaeva.java.lesson11.VehicleParkDB;

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
                        resultSet.getInt(8));
            }
            resultSet.close();

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();

        return cargoPlane;
    }

    @Override
    public Object get(int id, String city) {
        return null;
    }

    // @Override
    public List<VehicleParkDB> getBETWEEN(int fromN, int toN) {
        String sql = "SELECT * FROM test_db.vehicle_list WHERE passengers BETWEEN " + fromN + " AND " + toN + ";";
        List<VehicleParkDB> vehicleParkDBListBETWEEN = new ArrayList<>();

        try (PreparedStatement statement = Connection.getConnection().prepareStatement(sql)) {

            statement.setInt(1, fromN);
            statement.setInt(2, toN);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                vehicleParkDBListBETWEEN.add(new VehicleParkDB(
                        resultSet.getString(2).trim(),
                        resultSet.getString(3).trim(),
                        Enum.valueOf(Vehicle.Color.class, resultSet.getString(4).trim()),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        Enum.valueOf(Vehicle.VehicleState.class, resultSet.getString(7).trim()),
                        resultSet.getInt(8)));
            }
            resultSet.close();

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();

        return vehicleParkDBListBETWEEN;
    }

    @Override
    public List<VehicleParkDB> getall() {
        List<VehicleParkDB> vehicleParkDBList = new ArrayList<>();

        String sql = "SELECT * FROM test_db.vehicle_list";

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
                        resultSet.getInt(8)));
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

    public void add(VehicleParkDB vehicleParkDB) {
        String sql = "INSERT INTO test_db.vehicle_list  (id_vehicle_list,name,licensePlate,color," +
                "passengers,yearOfManufacture,vehicleState,vehicleType_fk) VALUES(default,?,?,?,?,?,?,?)";

        try (PreparedStatement preparedStatement = Connection.getConnection().prepareStatement(sql)) {

            preparedStatement.setString(2, vehicleParkDB.getName());
            preparedStatement.setString(3, vehicleParkDB.getLicensePlate());
            preparedStatement.setString(4, String.valueOf(vehicleParkDB.getColor()));
            preparedStatement.setInt(5, vehicleParkDB.getPassengers());
            preparedStatement.setInt(6, vehicleParkDB.getYearOfManufacture());
            preparedStatement.setString(7, String.valueOf(vehicleParkDB.getVehicleState()));
            preparedStatement.setInt(8, vehicleParkDB.getVehicleType());

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();

    }

    @Override
    public void add() {

        try (Statement statement = Connection.getConnection().createStatement()) {

            statement.executeUpdate("INSERT INTO test_db.vehicle_list  (id_vehicle_list,name,licensePlate,color," +
                    "passengers,yearOfManufacture,vehicleState,vehicleType_fk) VALUES(default,'CargoPlane: Rhinoceros beetle2','C222B'," +
                    "'BLUE','122','1992','REPAIR','1')");

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();

    }
}
