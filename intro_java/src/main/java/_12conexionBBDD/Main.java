package _12conexionBBDD;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        createNewDatabase("test.db");
    }

    public static void createNewDatabase(String fileName) {
        String url = "jdbc:sqlite:intro_java/src/main/java/_12conexionBBDD/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("El nombre del driver es " + meta.getDriverName());
                System.out.println("Se ha creado una nueva base de datos.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
