package com.mysql;
import java.sql.*;

public class Mysql_select {
	
	    public static void main(String[] args) {
	        Connection dbConnection = null;
	        try {
	            // Connect to MySQL
	            String url = "jdbc:mysql://localhost:3306/test"; // Use your port and DB name
	            String user = "root";
	            String password = ""; // Default in XAMPP unless changed

	            dbConnection = DriverManager.getConnection(url, user, password);
	            System.out.println("Successfully connected to MySQL database test");

	            // SELECT existing records
	            String query = "SELECT * FROM coffee";
	            Statement st = dbConnection.createStatement();
	            ResultSet rs = st.executeQuery(query);

	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String coffee_name = rs.getString("coffee_name");
	                int priced = rs.getInt("priced");

	                System.out.format("\n%d, %s, %d", id, coffee_name, priced);
	            }

	            // INSERT a new record
	            String insertQuery = "INSERT INTO coffee (coffee_name, priced) VALUES (?, ?)";
	            PreparedStatement stmt = dbConnection.prepareStatement(insertQuery);
	            stmt.setString(1, "Tajmahal");
	            stmt.setInt(2, 950);
	            stmt.executeUpdate();
	            stmt.close();

	        } catch (Exception e) {
	            System.err.println("Got an exception!");
	            e.printStackTrace();
	        } finally {
	            try {
	                if (dbConnection != null) dbConnection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}


	
	


