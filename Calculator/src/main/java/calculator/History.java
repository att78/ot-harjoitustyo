/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tallbera
 */
public class History {

    Connection connection;

    public History() throws Exception {
        connection = DriverManager.getConnection("jdbc:h2:./calculator.db");
        String query = "CREATE TABLE IF NOT EXISTS operations (result varchar NOT NULL, created timestamp) ;"; //table beginning
        connection.createStatement().execute(query);
    }

    public void closeConnection() throws Exception {
        connection.close();
    }

    //add and list operations
    public void add(String string) {
        String query = "INSERT INTO operations (result, created) VALUES (?, ?);";
        try (Statement stmt = connection.createStatement()) {
            PreparedStatement prepared = connection.prepareStatement(query);
            prepared.setString(1, string);
            prepared.setDate(2, new Date(System.currentTimeMillis())); //timestamp?
            prepared.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<String> list() {
        ArrayList<String> results = new ArrayList();
        String getResults = "SELECT result, created FROM operations ORDER BY created DESC;";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(getResults);
            while (rs.next()) {
                results.add(rs.getString("result"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return results;
    }

}
