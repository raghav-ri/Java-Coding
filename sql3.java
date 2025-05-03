// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.util.Scanner;

// class DatabaseExample {
//     public static void main(String[] args) {
//         Connection conn = null;
//         PreparedStatement pstmt = null;
//         ResultSet rs = null;
//         Scanner scanner = new Scanner(System.in);
        

//         try {
//             Class.forName("com.mysql.jdbc.Driver");

//             int studentIdInput = scanner.nextInt();

//             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ri_db", "test", "test123");

//             String sql = "SELECT * FROM students WHERE student_id = ?";
//             pstmt = conn.prepareStatement(sql);
//             pstmt.setInt(1, studentIdInput);

//             rs = pstmt.executeQuery();

//             boolean foundRecord = false;
//             if (rs.next()) {
//                 foundRecord = true;
//                 int studentId = rs.getInt("student_id");
//                 String firstName = rs.getString("first_name");
//                 String lastName = rs.getString("last_name");
//                 int age = rs.getInt("age");
//                 String email = rs.getString("email");
//                 java.sql.Date enrollmentDate = rs.getDate("enrollment_date");

//                 System.out.println("Student ID: " + studentId);
//                 System.out.println("First Name: " + firstName);
//                 System.out.println("Last Name: " + lastName);
//                 System.out.println("Age: " + age);
//                 System.out.println("Email: " + email);
//                 System.out.println("Enrollment Date: " + enrollmentDate);
//             }

//             if (!foundRecord) {
//                 System.out.println("No record found for student ID: " + studentIdInput);
//             }
//         } 
//         catch (SQLException | ClassNotFoundException e) {
//             e.printStackTrace();
//         } finally {
//             try {
//                 if (rs != null) {
//                     rs.close();
//                 }
//             } catch (SQLException e) {
//                 e.printStackTrace();
//             }
//             try {
//                 if (pstmt != null) {
//                     pstmt.close();
//                 }
//             } catch (SQLException e) {
//                 e.printStackTrace();
//             }
//             try {
//                 if (conn != null) {
//                     conn.close();
//                 }
//             } catch (SQLException e) {
//                 e.printStackTrace();
//             }
//             scanner.close();
//         }
//     }
// }