package com.shokhboz.jdbcTest.day01;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class FlexibleNavigation {
    private static final String url = "jdbc:oracle:thin:@3.85.103.221:1521:XE";
    private static final String username = "hr";
    private static final String password = "hr";

    private static Connection connection;
    private static Statement statement;
    private static ResultSet res;

    @BeforeAll
    static void settingUp() throws SQLException {
        // to connect to a database
        connection = DriverManager.getConnection(url, username, password);
        // for statements
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        // res -- starts only data (no table headers info)
        res = statement.executeQuery("select * from EMPLOYEES");
    }

    @AfterAll
    static void tearDown() throws SQLException {
        res.close();
        statement.close();
        connection.close();
    }

    @Test
    public void work() throws SQLException {
        while (res.next())
            System.out.println(res.getString("FIRST_NAME") + " - " + res.getString("LAST_NAME"));

        res.last();

        int rowNumber = res.getRow();
        System.out.println(rowNumber);

        System.out.println("-----ABSOLUTE-----");
        res.absolute(10);
        System.out.println(res.getString(1)+" - "+ res.getString(2));
        System.out.println(res.getRow());


        res.first();
        System.out.println("--==PRINT ALL TABLE CONTENT DYNAMICLY==--");

        while(res.next()){
            System.out.println(res.getString(1)+"  "+res.getString(2));
        }




    }
}