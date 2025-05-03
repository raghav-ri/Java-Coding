import java.sql.*;

public class sql_basic {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String username = "root";
        String password = "password";

        Connection conn = null;
        Statement stmt = null;

        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            conn = DriverManager.getConnection(url, username, password);

            // Create a statement
            stmt = conn.createStatement();

            // Create a table
            String createTableSQL = "CREATE TABLE employees (" +
                                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                    "name VARCHAR(100), " +
                                    "salary DOUBLE)";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table created successfully!");

            // Insert data
            String insertSQL = "INSERT INTO employees (name, salary) VALUES ('Alice', 50000), ('Bob', 60000)";
            stmt.executeUpdate(insertSQL);
            System.out.println("Data inserted successfully!");

            // Query data
            String selectSQL = "SELECT * FROM employees";
            ResultSet rs = stmt.executeQuery(selectSQL);

            // Process the results
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Salary: " + rs.getDouble("salary"));
            }

            // Close the ResultSet
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
