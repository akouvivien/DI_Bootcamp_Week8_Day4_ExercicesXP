import Exercice2.Exercice2;
import models.Company;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Exercice1.createTable();

        //Exercice 2
        List<Company> CompanyList = Arrays.asList(
                new Company(1, "Akou", 27, "Abidjan", 700000.00),
                new Company(2, "Kobenan", 25, "Daoukro", 20000.00),
                new Company(3, "Ndy", 12, "Norway", 20001.00)
        );
        Exercice2.insertCompany(CompanyList);

        //Exercice 3 a faire
    }
}