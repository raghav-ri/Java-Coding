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

            // 1. Create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), salary DOUBLE)";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table created successfully!");

            // 2. Insert data
            String insertSQL = "INSERT INTO employees (name, salary) VALUES ('Alice', 50000), ('Bob', 60000)";
            stmt.executeUpdate(insertSQL);
            System.out.println("Data inserted successfully!");

            // 3. Read data
            String selectSQL = "SELECT * FROM employees";
            ResultSet rs = stmt.executeQuery(selectSQL);
            System.out.println("Reading data from the table:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +", Name: " + rs.getString("name") +", Salary: " + rs.getDouble("salary"));
            }
            rs.close();

            // 4. Update data
            String updateSQL = "UPDATE employees SET salary = salary + 5000 WHERE name = 'Alice'";
            int rowsUpdated = stmt.executeUpdate(updateSQL);
            System.out.println(rowsUpdated + " row(s) updated!");

            // Verify the update
            rs = stmt.executeQuery(selectSQL);
            System.out.println("Data after update:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Salary: " + rs.getDouble("salary"));
            }
            rs.close();

            // 5. Delete data
            String deleteSQL = "DELETE FROM employees WHERE name = 'Bob'";
            int rowsDeleted = stmt.executeUpdate(deleteSQL);
            System.out.println(rowsDeleted + " row(s) deleted!");

            // Verify the deletion
            rs = stmt.executeQuery(selectSQL);
            System.out.println("Data after deletion:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Salary: " + rs.getDouble("salary"));
            }
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

