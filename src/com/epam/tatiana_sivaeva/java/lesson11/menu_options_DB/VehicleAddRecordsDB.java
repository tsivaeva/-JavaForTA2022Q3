package com.epam.tatiana_sivaeva.java.lesson11.menu_options_DB;

import com.epam.tatiana_sivaeva.java.lesson11.connection.Connection;

import java.sql.SQLException;
import java.sql.Statement;


public class VehicleAddRecordsDB {

    public void addRecords() {
        String sqlAddVehicleType = "INSERT IGNORE test_db.vehicle_type values (default,'CargoPlane')," +
                "(default,'PassengerPlane'),(default,'LifeSavingPlane')";

        String queryAddCargoPlane1 = "INSERT INTO test_db.vehicle_list (id_vehicle_list,name,licensePlate,color," +
                "passengers,yearOfManufacture,vehicleState,vehicleType_fk) VALUES(default,'CargoPlane: 1'," +
                "'C111B','BLUE',111,1992,'REPAIR',(SELECT id_VehicleType FROM test_db.vehicle_type WHERE vehicleType = 'CargoPlane')) ON DUPLICATE KEY UPDATE passengers = 123";
        String queryAddCargoPlane2 = "INSERT INTO test_db.vehicle_list (id_vehicle_list,name,licensePlate,color," +
                "passengers,yearOfManufacture,vehicleState,vehicleType_fk) VALUES(default,'CargoPlane: 2'," +
                "'C222B','BLUE',122,1992,'REPAIR',(SELECT id_VehicleType FROM test_db.vehicle_type WHERE vehicleType = 'CargoPlane')) ON DUPLICATE KEY UPDATE passengers = 123";
        String queryAddCargoPlane3 = "INSERT INTO test_db.vehicle_list (id_vehicle_list,name,licensePlate,color," +
                "passengers,yearOfManufacture,vehicleState,vehicleType_fk) VALUES(default,'CargoPlane: 3'," +
                "'C333B','BLUE',133,1992,'REPAIR',(SELECT id_VehicleType FROM test_db.vehicle_type WHERE vehicleType = 'CargoPlane')) ON DUPLICATE KEY UPDATE passengers = 123";

        String queryAddLifeSavingPlane1 = "INSERT INTO test_db.vehicle_list (id_vehicle_list,name,licensePlate,color," +
                "passengers,yearOfManufacture,vehicleState,vehicleType_fk) VALUES(default,'LifeSavingPlane: 1'," +
                "'C444B','BLUE',133,1992,'REPAIR',(SELECT id_VehicleType FROM test_db.vehicle_type WHERE vehicleType = 'LifeSavingPlane')) ON DUPLICATE KEY UPDATE passengers = 123";
        String queryAddLifeSavingPlane2 = "INSERT INTO test_db.vehicle_list (id_vehicle_list,name,licensePlate,color," +
                "passengers,yearOfManufacture,vehicleState,vehicleType_fk) VALUES(default,'LifeSavingPlane: 2'," +
                "'C555B','BLUE',133,1992,'REPAIR',(SELECT id_VehicleType FROM test_db.vehicle_type WHERE vehicleType = 'LifeSavingPlane')) ON DUPLICATE KEY UPDATE passengers = 123";
        String queryAddLifeSavingPlane3 = "INSERT INTO test_db.vehicle_list (id_vehicle_list,name,licensePlate,color," +
                "passengers,yearOfManufacture,vehicleState,vehicleType_fk) VALUES(default,'LifeSavingPlane: 3'," +
                "'C666B','BLUE',133,1992,'REPAIR',(SELECT id_VehicleType FROM test_db.vehicle_type WHERE vehicleType = 'LifeSavingPlane')) ON DUPLICATE KEY UPDATE passengers = 123";

        String queryAddPassengerPlane1 = "INSERT INTO test_db.vehicle_list (id_vehicle_list,name,licensePlate,color," +
                "passengers,yearOfManufacture,vehicleState,vehicleType_fk) VALUES(default,'PassengerPlane: 1'," +
                "'C777B','BLUE',133,1992,'REPAIR',(SELECT id_VehicleType FROM test_db.vehicle_type WHERE vehicleType = 'PassengerPlane')) ON DUPLICATE KEY UPDATE passengers = 123";
        String queryAddPassengerPlane2 = "INSERT INTO test_db.vehicle_list (id_vehicle_list,name,licensePlate,color," +
                "passengers,yearOfManufacture,vehicleState,vehicleType_fk) VALUES(default,'PassengerPlane: 2'," +
                "'C888B','BLUE',133,1992,'REPAIR',(SELECT id_VehicleType FROM test_db.vehicle_type WHERE vehicleType = 'PassengerPlane')) ON DUPLICATE KEY UPDATE passengers = 123";
        String queryAddPassengerPlane3 = "INSERT INTO test_db.vehicle_list (id_vehicle_list,name,licensePlate,color," +
                "passengers,yearOfManufacture,vehicleState,vehicleType_fk) VALUES(default,'PassengerPlane: 3'," +
                "'C999B','BLUE',133,1992,'REPAIR',(SELECT id_VehicleType FROM test_db.vehicle_type WHERE vehicleType = 'PassengerPlane')) ON DUPLICATE KEY UPDATE passengers = 123";

        try (Statement statement = Connection.getConnection().createStatement()) {



            statement.executeUpdate(sqlAddVehicleType);

            statement.executeUpdate(queryAddCargoPlane1);
            statement.executeUpdate(queryAddCargoPlane2);
            statement.executeUpdate(queryAddCargoPlane3);

            statement.executeUpdate(queryAddLifeSavingPlane1);
            statement.executeUpdate(queryAddLifeSavingPlane2);
            statement.executeUpdate(queryAddLifeSavingPlane3);

            statement.executeUpdate(queryAddPassengerPlane1);
            statement.executeUpdate(queryAddPassengerPlane2);
            statement.executeUpdate(queryAddPassengerPlane3);

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution" + e);
        }
        Connection.close();
    }
}
