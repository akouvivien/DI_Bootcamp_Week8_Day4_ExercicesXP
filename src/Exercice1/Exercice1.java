package Exercice1;

import database.App;
import java.sql.SQLException;
import java.sql.Statement;

    public class Exercice1 {
        public static void createTable() {
            final String SQL = "CREATE TABLE company(id SERIAL PRIMARY KEY NOT NULL,name TEXT NOT NULL,age INT NOT NULL, address CHAR(50), salary REAL)";

            try {
                App connection = new App();
                connection.connect();
                //effectuer les requetes
                Statement statement = connection.connect().createStatement();

                statement.executeUpdate(SQL);
                System.out.println("Table  company créé avec succès");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
