package com.lodin.login;

import java.security.MessageDigest;
import java.sql.*;
import java.util.Scanner;

public class Registration {
    private DBMethods dbMethods = new DBMethods();

    private ResultSet rs = null;
    private Connection connection = null;
    private PreparedStatement statement = null;



    public void register(User user) throws SQLException {
        Scanner scan = new Scanner(System.in);
        dbMethods.connect_to_db("postgres", "postgres", "a1r2u3k4a5");
        statement = (PreparedStatement) dbMethods.createStatement();

        this.connection = connection;

        String username = user.getUsername();
        String iin = user.getIin();
        String password = user.getPassword();
        String number = user.getNumber();

        String hashedPassword = hashPassword(password);

        String query = "INSERT INTO user_table(username, iin, password, number) VALUES('" + username + "', '" + iin + "', '" + hashedPassword +"', '" + number +  "')";
        statement.executeUpdate(query);
        System.out.println("Successfully registered.");
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();

            for (byte aHash : hash) {
                String hex = Integer.toHexString(0xff & aHash);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
