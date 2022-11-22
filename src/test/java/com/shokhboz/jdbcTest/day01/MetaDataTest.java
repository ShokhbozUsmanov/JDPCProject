package com.shokhboz.jdbcTest.day01;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class MetaDataTest {

    String dbURL = "jdbc:oracle:thin:@3.85.103.221:1521:XE";
    String dbUserName = "hr";
    String dbPassword = "hr";

    @Test
    public void task1() throws SQLException {

        // DriverManager Class getConnection method will help to connect database
        Connection conn = DriverManager.getConnection(dbURL, dbUserName, dbPassword);

        // It helps us to execute queries
        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        // ResultSet will store data acter execution. It stores only data (there is no table info)
        ResultSet rs = statement.executeQuery("select * from employees");

        DatabaseMetaData dbMetaData = conn.getMetaData();

        System.out.println(dbMetaData.getUserName());
        System.out.println(dbMetaData.getDriverName());
        System.out.println(dbMetaData.getDatabaseProductName());
        System.out.println(dbMetaData.getDatabaseProductVersion());
        System.out.println(dbMetaData.getDriverVersion());

        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        System.out.println(columnCount);

        System.out.println(rsmd.getColumnName(3));

        for (int i = 1; i <= columnCount ; i++) {
            System.out.println(rsmd.getColumnName(i));
        }

        while(rs.next()){
            for(int i =1; i<=rsmd.getColumnCount(); i++){
                System.out.print(rsmd.getColumnName(i)+" - "+rs.getString(1));
            }
            System.out.println();
        }






        // close connection
        rs.close();
        statement.close();
        conn.close();
    }

}