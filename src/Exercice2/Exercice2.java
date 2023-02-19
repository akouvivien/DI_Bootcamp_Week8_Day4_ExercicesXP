package Exercice2;

import database.App;
import models.Company;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Exercice2 {
    /**
     * insert multiple actors
     */
    public static void insertCompany(List<Company> Companies) {

        String SQL = "INSERT INTO company(ID,NAME,AGE,ADDRESS,SALARY) "
                + "VALUES(?,?,?,?,?)";
        try {
                App connection = new App();
                connection.connect();
                //effectuer les requetes
                PreparedStatement statement = connection.connect().prepareStatement(SQL);
            int count = 0;

            for (Company company : Companies) {
                statement.setInt(1, company.getId());
                statement.setString(2, company.getName());
                statement.setInt(3, company.getAge());
                statement.setString(4, company.getAddress());
                statement.setDouble(5, company.getSalary());
                statement.addBatch();
                count++;
                // execute every 100 rows or less
                if (count == Companies.size()) {
                    statement.executeBatch();
                }
            }
            System.out.println("succès");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
