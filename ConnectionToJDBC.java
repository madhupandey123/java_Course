package madhu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionToJDBC {

    public static void main(String[] args) {
//    	
//    	Create a JDBC connection, print on the console if connection established successfully.
//    	perform CRUD operation after creating and adding 15 records of data in the table.
//    	Print all the names on the console having 'e' in their name.
        // Load the driver and establish a connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String user = "root";
            String password = "root";

            // Create a connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection created successfully.");

            // Create a statement
            Statement statement = connection.createStatement();

            // Create table College_Student_details (if not exists)
            String createTableQuery = "CREATE TABLE IF NOT EXISTS College_Student_details ("
                    + "Student_id INT,"
                    + "Student_Name VARCHAR(255),"
                    + "Student_Address VARCHAR(255),"
                    + "Student_course VARCHAR(255),"
                    + "Student_fees BIGINT,"
                    + "PRIMARY KEY (Student_id)"
                    + ")";
            statement.executeUpdate(createTableQuery);
            System.out.println("Table created successfully.");

            // Insert 15 records into the table
            String insertQuery = "INSERT INTO College_Student_details (Student_id, Student_Name, Student_Address, Student_course, Student_fees) VALUES "
                    + "(1, 'Alice Johnson', '123 Maple St, Springfield', 'Computer Science', 10000), "
                    + "(2, 'Bob Smith', '456 Oak St, Springfield', 'Mechanical Engineering', 12000), "
                    + "(3, 'Charlie Brown', '789 Pine St, Springfield', 'Electrical Engineering', 11000), "
                    + "(4, 'David Wilson', '101 Birch St, Springfield', 'Civil Engineering', 13000), "
                    + "(5, 'Emma Davis', '202 Cedar St, Springfield', 'Computer Science', 10000), "
                    + "(6, 'Fiona Clark', '303 Elm St, Springfield', 'Biology', 9000), "
                    + "(7, 'George Miller', '404 Walnut St, Springfield', 'Chemistry', 9500), "
                    + "(8, 'Hannah Lee', '505 Ash St, Springfield', 'Physics', 9200), "
                    + "(9, 'Ian Moore', '606 Fir St, Springfield', 'Mathematics', 8700), "
                    + "(10, 'Jane Taylor', '707 Palm St, Springfield', 'Computer Science', 10000), "
                    + "(11, 'Kevin Anderson', '808 Spruce St, Springfield', 'Business Administration', 10500), "
                    + "(12, 'Laura Thomas', '909 Cherry St, Springfield', 'Economics', 11000), "
                    + "(13, 'Mike Jackson', '1010 Willow St, Springfield', 'History', 8000), "
                    + "(14, 'Nina Harris', '1111 Maple St, Springfield', 'Philosophy', 7500), "
                    + "(15, 'Oscar Martin', '1212 Oak St, Springfield', 'Political Science', 8500)";
            statement.executeUpdate(insertQuery);
            System.out.println("Data inserted successfully.");

            // Select all records from the table
            String selectQuery = "SELECT * FROM College_Student_details";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            // Print all names containing 'e'
            System.out.println("Names containing 'e':");
            while (resultSet.next()) {
                String name = resultSet.getString("Student_Name");
                if (name.toLowerCase().contains("e")) {
                    System.out.println(name);
                }
            }

            // Update a record in the table
            String updateQuery = "UPDATE College_Student_details SET Student_fees = 11500 WHERE Student_id = 2";
            statement.executeUpdate(updateQuery);
            System.out.println("Record updated successfully.");

            // Delete a record from the table
            String deleteQuery = "DELETE FROM College_Student_details WHERE Student_id = 3";
            statement.executeUpdate(deleteQuery);
            System.out.println("Record deleted successfully.");

            // Close connections
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
//        OUTPUT:
//        Connection created successfully.
//        Table created successfully.
//        Data inserted successfully.
//        Names containing 'e':
//        Alice Johnson
//        Charlie Brown
//        Emma Davis
//        George Miller
//        Hannah Lee
//        Ian Moore
//        Jane Taylor
//        Kevin Anderson
//        Mike Jackson
//        Alice Johnson
//        Charlie Brown
//        Emma Davis
//        George Miller
//        Hannah Lee
//        Ian Moore
//        Jane Taylor
//        Kevin Anderson
//        Mike Jackson
//        Alice Johnson
//        Charlie Brown
//        Emma Davis
//        George Miller
//        Hannah Lee
//        Ian Moore
//        Jane Taylor
//        Kevin Anderson
//        Mike Jackson
//        Alice Johnson
//        Charlie Brown
//        Emma Davis
//        George Miller
//        Hannah Lee
//        Ian Moore
//        Jane Taylor
//        Kevin Anderson
//        Mike Jackson
//        Record updated successfully.
//        Record deleted successfully.

    }
}