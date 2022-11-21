package com.shokhboz.jdbcTest;

import java.sql.*;

public class TestOracleConnection {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:oracle:thin:@3.85.103.221:1521:XE";

        String username = "hr";
        String password = "hr";

        Connection connection = DriverManager.getConnection(url,username,password);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from regions");

//        resultSet.next();
//        System.out.println(resultSet.getInt(1));
//        System.out.println(resultSet.getString("REGION_ID"));
//        System.out.println(resultSet.getInt("REGION_ID"));
//
//        System.out.println(resultSet.getString(2));
//        System.out.println(resultSet.getString("REGION_NAME"));
//
//        resultSet.next();
//
//        System.out.println(resultSet.getString(1)+" - "+ resultSet.getString(2));
//
//        resultSet.next();
//        System.out.println(resultSet.getString("REGION_ID")+" - "+ resultSet.getString("REGION_NAME"));
//
//        resultSet.next();
//        System.out.println(resultSet.getString("REGION_ID")+" - "+ resultSet.getString("REGION_NAME"));

        while(resultSet.next()){
            System.out.println("---------------");
            System.out.println(resultSet.getString(1)+" - "+ resultSet.getString(2));

        }







        resultSet.close();
        statement.close();
        connection.close();


    }
}
