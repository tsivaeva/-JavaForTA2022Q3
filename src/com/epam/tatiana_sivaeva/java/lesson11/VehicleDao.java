package com.epam.tatiana_sivaeva.java.lesson11;

import com.epam.tatiana_sivaeva.java.lesson11.connection.Connection;
import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;
import com.epam.tatiana_sivaeva.java.lesson3.vehicle.CargoPlane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
                //   cargoPlane = new CargoPlane(
                //   resultSet.getInt(1),
                //   resultSet.getString(2).trim(),
                //     resultSet.getString(3).trim(),
                //     resultSet.getString(4).trim(), //Vehicle.Color.class),
                //   .valueOf(Vehicle.Color.BLUE),  //Vehicle.Color.BLUE(),
                //   resultSet.getInt(5),
                //  resultSet.getInt(6));
                //  resultSet.getObject(7, Vehicle.VehicleState.class));
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

    @Override
    public List getall() {
        return null;
    }

    @Override
    public void add(Object object) {

    }

    @Override
    public void add() {

    }
}
