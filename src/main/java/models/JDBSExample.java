package models;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class JDBSExample {
//Register teh Driver
    public static void main(String[] args){

        try {
            DriverManager.registerDriver(new Driver());
//Make the Connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
//Create the Statement

            Statement stmt = connection.createStatement();

// Run query with statement and parse result

            String query = "select * from albums;";

            ResultSet rs = stmt.executeQuery(query);

            if(rs.next()){
                System.out.println(rs.getString("artist"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
