package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String dbURL = "jdbc:mysql://localhost:3306/PP_1_1_3";
    private static final String dbUserName = "root";
    private static final String dbPassword = "vfq’cre’km2204";

    public static Connection getConnection(){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("исключение в утил гет коннекшн");
        }
        return connection;
    }

    public static void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("исключение в утил клоуз коннекшн");
        }
    }
}
