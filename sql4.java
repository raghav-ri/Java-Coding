// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.util.Scanner;

// class JDBCConnectionTest {
//     public static void main(String[] args) {
//         Connection conn = null;
//         Scanner scanner = new Scanner(System.in);
        
//         try {
//             // Load the MySQL JDBC driver (for Connector/J 8.0 or later, update the driver class if necessary)
//             Class.forName("com.mysql.jdbc.Driver");


//             // Attempt to establish the connection using user-provided credentials
//             String dbUrl = "jdbc:mysql://localhost:3306/ri_db";
//             conn = DriverManager.getConnection(dbUrl, "test", "test123");
//             System.out.println("Connection established successfully.");

//         } catch (ClassNotFoundException e) {
//             System.err.println("MySQL JDBC Driver not found. Please add the driver to your classpath.");
//             e.printStackTrace();
//         } catch (SQLException e) {
//             System.err.println("Failed to establish connection to the database. Check your credentials and database URL.");
//             System.err.println("Error Message: " + e.getMessage());
//             e.printStackTrace();
//         } 
//         finally {
//             if (conn != null) {
//                 try {
//                     conn.close();
//                     System.out.println("Database connection closed.");
//                 } catch (SQLException e) {
//                     System.err.println("Error while closing the database connection.");
//                     e.printStackTrace();
//                 }
//             }
//             scanner.close();
//         }
//     }
// }