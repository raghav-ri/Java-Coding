// import java.sql.*;
// import java.util.Scanner;

// class UpdateEmployeeSalary {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         int employeeId = scanner.nextInt(); 
        
//         double newSalary = scanner.nextDouble(); 
        
//         String url = "jdbc:mysql://localhost/ri_db";  
//         String username = "test";  
//         String password = "test123";  

//         Connection conn = null;
//         PreparedStatement pstmt = null;
//         Statement stmt = null;
//         ResultSet rs = null;
        

//         try {
//             // Establishing the connection
//             conn = DriverManager.getConnection(url, username, password);

//             // SQL query to update the salary
//             String sqlUpdate = "UPDATE employees SET salary = ? WHERE id = ?";
            
//             // Creating PreparedStatement for update
//             pstmt = conn.prepareStatement(sqlUpdate);
            
//             // Setting the parameters for the update query
//             pstmt.setDouble(1, newSalary);  // Set the new salary
//             pstmt.setInt(2, employeeId);  // Set the employee ID

//             // Executing the update
//             int rowsAffected = pstmt.executeUpdate();

//             // Check if the update was successful
//             if (rowsAffected > 0) {
//                 System.out.println("Salary updated successfully for Employee ID: " + employeeId);
                
//                 // SQL query to retrieve the updated employee details
//                 String sqlSelect = "SELECT * FROM employees WHERE id = ?";
//                 stmt = conn.createStatement();
                
//                 // Prepare the select query
//                 pstmt = conn.prepareStatement(sqlSelect);
//                 pstmt.setInt(1, employeeId);
                
//                 // Executing the select query
//                 rs = pstmt.executeQuery();
                
//                 // Display the updated employee details
//                 if (rs.next()) {
//                     int id = rs.getInt("id");
//                     String name = rs.getString("name");
//                     double salary = rs.getDouble("salary");
                    
//                     System.out.println("Updated Employee Details:");
//                     System.out.println("ID: " + id);
//                     System.out.println("Name: " + name);
//                     System.out.println("Salary: " + salary);
//                 }
//             } else {
//                 System.out.println("No employee found with ID " + employeeId);
//             }
//         } 
//         catch (SQLException e) {
//             e.printStackTrace();
//         } finally {
//             try {
//                 if (rs != null) rs.close();
//                 if (pstmt != null) pstmt.close();
//                 if (conn != null) conn.close();
//             } catch (SQLException e) {
//                 e.printStackTrace();
//             }
//         }

//         scanner.close();
//     }
// }