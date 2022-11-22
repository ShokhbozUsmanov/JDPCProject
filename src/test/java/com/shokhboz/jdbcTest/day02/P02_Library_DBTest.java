package com.shokhboz.jdbcTest.day02;

import com.shokhboz.jdbcTest.utils.DB_Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P02_Library_DBTest {

    String url = "jdbc:mysql://34.230.35.214:3306/library2";
    String username = "library2_client";
    String password = "6s2LQQTjBcGFfDhY";

    @Test
    public void task1(){
        DB_Util.createConnection(url,username,password);

        DB_Util.runQuery("select count(*) from books");
        String bookCountDB = DB_Util.getFirstRowFirstColumn();
        String bookCountUI = "3963";
        Assertions.assertEquals(bookCountUI,bookCountDB);
        DB_Util.destroy();















    }

}
