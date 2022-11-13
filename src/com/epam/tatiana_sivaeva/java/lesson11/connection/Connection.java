package com.epam.tatiana_sivaeva.java.lesson11.connection;

import com.epam.tatiana_sivaeva.java.lesson3.Vehicle;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Connection {

    private static java.sql.Connection conn;

    public static void main(String[] args) {

        List<Vehicle> vehicles1 = new ArrayList<>();

        try (Statement statement = Connection.getConnection().createStatement()){

            ResultSet resultSet = statement.executeQuery("SELECT * FROM test_db.cargo_plane");

//            while (resultSet.next()){
//                vehicles1.get(new Vehicle(
//                      //  resultSet.getInt(1),
//                        resultSet.getString(2).trim(),
//                        resultSet.getString(3).trim(),
//                        resultSet.getObject(4,Vehicle.Color.), //.valueOf(Vehicle.Color.BLUE),  //Vehicle.Color.BLUE(),
//                        resultSet.getInt(5),
//                        resultSet.getInt(6),
//                        resultSet.getString(7).trim()) {
//                    @Override
//                    public void honk() {
//
//                    }
//                });
//            }
            System.out.println("tadam");


        }catch (SQLException e){
            System.err.println("Exeption during the statement execution");
        }
        Connection.close();
    }
    private static void registerDriver() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver is not found");
        }
        System.out.println("Driver is registred");
    }

    private static java.sql.Connection create() {
        registerDriver();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost;username=root;password=Password_123;ssl=false;");
            System.out.println("We are connected");
        } catch (SQLException e) {
            System.err.println("Connection is not established");
        }
        return conn;
    }

    public static java.sql.Connection getConnection() {
        if (conn == null) {
            return create();
        }
        return conn;
    }

    public static void close() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;

            } catch (SQLException e) {
                System.err.println("Error while closing the connection");
            }
        }
    }
}
