package com.epam.tatiana_sivaeva.java.lesson11.connection;

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

import com.epam.tatiana_sivaeva.java.lesson11.VehicleDao;
import com.epam.tatiana_sivaeva.java.lesson11.VehicleParkDB;
import com.epam.tatiana_sivaeva.java.lesson11.menu_options_DB.EnterVehicleDB;

public class VehicleDemo {
    public static void main(String[] args) {
// 1
        VehicleDao vehicleDao = new VehicleDao();
//        VehicleCreateDB vehicleCreateDB = new VehicleCreateDB();
//        vehicleCreateDB.createTables();
//        //2
//        VehicleAddRecordsDB vehicleAddRecordsDB = new VehicleAddRecordsDB();
//        vehicleAddRecordsDB.addRecords();
        System.out.println("VALUES(default,'CargoPlane: 3','C333B','BLUE',133,1992,'REPAIR',(SELECT id_VehicleType FROM test_db.vehicle_type WHERE vehicleType = 'CargoPlane')");
      //  VehicleParkDB vehicleParkDBadd = new VehicleParkDB()
        //EnterVehicleDB.main();
        vehicleDao.add(EnterVehicleDB.main());

        vehicleDao.getall().stream().forEach(System.out::print);
//3.Create update script to update a value in a record by specific parameter


    }
}
