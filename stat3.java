// import java.sql.*;
// import java.util.Scanner;

// class SchoolManagementSystem {
//     public static void main(String[] args) {
//         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
//              Scanner scanner = new Scanner(System.in)) {

//             boolean running = true;

//             while (running) {
                
//                 int choice = scanner.nextInt();

//                 switch (choice) {
//                     case 1:
//                         addStudent(conn, scanner);
//                         break;
//                     case 2:
//                         updateGrades(conn, scanner);
//                         break;
//                     case 3:
//                         viewStudentRecord(conn, scanner);
//                         break;
//                     case 4:
//                         displayAllStudents(conn);
//                         break;
//                     case 5:
//                         System.out.println("Exiting School Management System.");
//                         running = false;
//                         break;
//                     default:
//                         System.out.println("Invalid choice. Please try again.");
//                 }
//             }
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }
    

//     public static void addStudent(Connection conn, Scanner scanner) {
//         int studentId = scanner.nextInt();
//         scanner.nextLine();  // Consume newline

//         String name = scanner.nextLine();

//         String gradeLevel = scanner.nextLine();

//         double gpa = scanner.nextDouble();

//         String insertQuery = "INSERT INTO students (student_id, name, grade_level, gpa) VALUES (?, ?, ?, ?)";
//         try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
//             stmt.setInt(1, studentId);
//             stmt.setString(2, name);
//             stmt.setString(3, gradeLevel);
//             stmt.setDouble(4, gpa);

//             int rowsInserted = stmt.executeUpdate();
//             System.out.println(rowsInserted > 0 ? "Student added successfully" : "Failed to add student.");
//         } catch (SQLException e) {
//             System.out.println("Error adding student: " + e.getMessage());
//         }
//     }

//     public static void updateGrades(Connection conn, Scanner scanner) {
//         int studentId = scanner.nextInt();

//         double newGpa = scanner.nextDouble();

//         // Validate GPA range
//         if (newGpa < 0.0 || newGpa > 4.0) {
//             System.out.println("GPA must be between 0.0 and 4.0.");
//             return;
//         }

//         String updateQuery = "UPDATE students SET gpa = ? WHERE student_id = ?";
//         try (PreparedStatement stmt = conn.prepareStatement(updateQuery)) {
//             stmt.setDouble(1, newGpa);
//             stmt.setInt(2, studentId);

//             int rowsUpdated = stmt.executeUpdate();
//             System.out.println(rowsUpdated > 0 ? "GPA updated successfully" : "Student not found.");
//         } catch (SQLException e) {
//             System.out.println("Error updating GPA: " + e.getMessage());
//         }
//     }

//     public static void viewStudentRecord(Connection conn, Scanner scanner) {
//         int studentId = scanner.nextInt();

//         String selectQuery = "SELECT * FROM students WHERE student_id = ?";
//         try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
//             stmt.setInt(1, studentId);

//             ResultSet rs = stmt.executeQuery();
//             if (rs.next()) {
//                 System.out.printf("ID: %d | Name: %s | Grade Level: %s | GPA: %.2f%n",
//                         rs.getInt("student_id"),
//                         rs.getString("name"),
//                         rs.getString("grade_level"),
//                         rs.getDouble("gpa"));
//             } else {
//                 System.out.println("Student not found.");
//             }
//         } catch (SQLException e) {
//             System.out.println("Error retrieving student record: " + e.getMessage());
//         }
//     }

//     public static void displayAllStudents(Connection conn) {
//         String displayQuery = "SELECT * FROM students ";
//         try (Statement stmt = conn.createStatement();
//              ResultSet rs = stmt.executeQuery(displayQuery)) {

//             System.out.println("ID | Name | Grade Level | GPA");
//             while (rs.next()) {
//                 System.out.printf("%d | %s | %s | %.2f%n",
//                         rs.getInt("student_id"),
//                         rs.getString("name"),
//                         rs.getString("grade_level"),
//                         rs.getDouble("gpa"));
//             }
//         } catch (SQLException e) {
//             System.out.println("Error displaying students: " + e.getMessage());
//         }
//     }

// }