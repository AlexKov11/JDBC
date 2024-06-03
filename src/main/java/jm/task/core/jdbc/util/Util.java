package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/mydbase";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "root";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
    // реализуйте настройку соеденения с БД
}
