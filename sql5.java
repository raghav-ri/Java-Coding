// public import java.sql.*;

// class RetrieveTableMetadata {
//     public static void main(String[] args) {
//         String url = "jdbc:mysql://localhost/ri_db";  
//         String username = "test";  
//         String password = "test123";  
        
//         Connection conn = null;
//         ResultSet rs = null;
//         ResultSetMetaData rsMetaData = null; 
        
//         try {
//             // Step 1: Establish the connection
//             conn = DriverManager.getConnection(url, username, password);
//             System.out.println("Connection established successfully!");

//             // Step 2: Get metadata about the 'users' table
//             DatabaseMetaData dbMetaData = conn.getMetaData();

//             // Step 3: Get the columns of the 'users' table
//             rs = dbMetaData.getColumns(null, null, "users", null);
            
//             // Step 4: Process the result set and print column details
//             System.out.println("Column names and types for 'users' table:");
//             while (rs.next()) {
//                 String columnName = rs.getString("COLUMN_NAME");
//                 String columnType = rs.getString("TYPE_NAME");
//                 System.out.println("Column Name: " + columnName + ", Column Type: " + columnType);
//             }
//         } 
//         catch (SQLException e) {
//             System.out.println("SQL Exception occurred: " + e.getMessage());
//             e.printStackTrace();
//         } finally {
//             try {
//                 if (rs != null) rs.close();
//                 if (conn != null) conn.close();
//             } catch (SQLException e) {
//                 System.out.println("Error closing resources: " + e.getMessage());
//             }
//         }
//     }
// }
    

