// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;

// class JDBCConnectionSetup {
//     public static void main(String[] args) {
//         Connection conn = null;
        
//         try {
//             Class.forName("com.mysql.jdbc.Driver");

//             String url = "jdbc:mysql://localhost:3306/ri_db";
//             String username = "test";
//             String password = "test123";

//             conn = DriverManager.getConnection(url, username, password);

//             System.out.println("Database connection established!");

//         } 
//         catch (ClassNotFoundException e) {
//             System.out.println("MySQL JDBC Driver not found. Please include it in your library path.");
//             e.printStackTrace();
//         } catch (SQLException e) {
//             System.out.println("Failed to connect to the database. Check the connection details.");
//             e.printStackTrace();
//         } 
//  finally
//         {
//             System.out.println(conn);
//         }
//     }
    
// }
