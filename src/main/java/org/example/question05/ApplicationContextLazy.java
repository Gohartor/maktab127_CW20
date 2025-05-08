package org.example.question05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class ApplicationContextLazy {

    private static ApplicationContextLazy acl;

    private ApplicationContextLazy() {
    }

    public static ApplicationContextLazy getInstance() {
        if (Objects.isNull(acl)) {
            acl = new ApplicationContextLazy();
        }
        return acl;
    }

    private Connection connection;

    public Connection getConnection() {
        if (Objects.isNull(connection)) {
            try {
                DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/cw20_q5",
                        "postgres",
                        "446465");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
