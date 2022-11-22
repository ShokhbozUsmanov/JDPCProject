package com.shokhboz.jdbcTest.day02;

import com.shokhboz.jdbcTest.utils.DB_Util;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class DB_UtilPractice {

    @Test
    public void task1() {

        // create a connection
        DB_Util.createConnection();

        // run query
        DB_Util.runQuery("select first_name,last_name,salary from employees");

        // get results
        System.out.println("---GET ME FIRST ROW FIRST CELL---");
        System.out.println(DB_Util.getFirstRowFirstColumn());

        System.out.println("---GET ME ALL COLUMN NAMES---");
        System.out.println(DB_Util.getAllColumnNamesAsList());

        System.out.println("---GET ME ALL COLUMN NAMES---");
        System.out.println(DB_Util.getColumnDataAsList(1));

        System.out.println("---GET ME ALL COLUMN NAMES---");

        for (Map<String, String> eachRowMap : DB_Util.getAllRowAsListOfMap()) {
            System.out.println(eachRowMap);
        }

    }
}
