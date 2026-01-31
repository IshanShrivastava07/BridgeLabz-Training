package com.HandsonJSON.JSONfromDB;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.*;
import java.util.*;

public class DBtoJSONReport {
    public static void main(String[] args) throws Exception {

        List<Map<String, Object>> report = new ArrayList<>();

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb", "root", "password");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT id, name FROM users");

        while (rs.next()) {
            Map<String, Object> row = new HashMap<>();
            row.put("id", rs.getInt("id"));
            row.put("name", rs.getString("name"));
            report.add(row);
        }

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(report));

        con.close();
    }
}
