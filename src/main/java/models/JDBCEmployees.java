package models;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCEmployees {

    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new Driver());
//Make the Connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
//Create the Statement

            Statement stmt = connection.createStatement();

// Run query with statement and parse result



            String query = "select * from employees;";

            List<String> first_names = new ArrayList<>();

            ResultSet rs = stmt.executeQuery(query);
            for (int i = 0; i <= 10; i++) {
                rs.next();
                System.out.println(i + 1 + ": " + rs.getString("first_name"));
                first_names.add(rs.getString("first_name"));
            }


        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
