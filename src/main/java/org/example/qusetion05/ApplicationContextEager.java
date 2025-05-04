package org.example.qusetion05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ApplicationContextEager {

    private static final ApplicationContextEager ace = new ApplicationContextEager();

    private ApplicationContextEager(){
    }

    public static ApplicationContextEager getInstance() {
        return ace;
    }

    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/cw20_q5",
                    "postgres",
                    "446465");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
