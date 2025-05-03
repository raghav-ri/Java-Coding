// import java.sql.*;
// import java.util.Scanner;

// class InventoryManagementSystem {
//     public static void main(String[] args) {
//         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
//              Scanner scanner = new Scanner(System.in)) {

//             boolean running = true;

//             while (running) {
               
//                 int choice = scanner.nextInt();

//                 switch (choice) {
//                     case 1:
//                         addItem(conn, scanner);
//                         break;
//                     case 2:
//                         restockItem(conn, scanner);
//                         break;
//                     case 3:
//                         reduceStock(conn, scanner);
//                         break;
//                     case 4:
//                         displayInventory(conn);
//                         break;
//                     case 5:
//                         System.out.println("Exiting Inventory Management System.");
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
    

//     public static void addItem(Connection conn, Scanner scanner) {
//         int itemId = scanner.nextInt();
//         scanner.nextLine();

//         String name = scanner.nextLine();

//         int quantity = scanner.nextInt();

//         double price = scanner.nextDouble();

//         String insertQuery = "INSERT INTO items (item_id, name, quantity, price) VALUES (?, ?, ?, ?)";
//         try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
//             stmt.setInt(1, itemId);
//             stmt.setString(2, name);
//             stmt.setInt(3, quantity);
//             stmt.setDouble(4, price);

//             int rowsInserted = stmt.executeUpdate();
//             System.out.println(rowsInserted > 0 ? "Item added successfully" : "Failed to add item.");
//         } catch (SQLException e) {
//             System.out.println("Error adding item: " + e.getMessage());
//         }
//     }

//     public static void restockItem(Connection conn, Scanner scanner) {
//         int itemId = scanner.nextInt();

//         int quantityToAdd = scanner.nextInt();

//         // Check if the quantity is positive
//         if (quantityToAdd <= 0) {
//             System.out.println("Quantity to add must be positive.");
//             return;
//         }

//         String updateQuery = "UPDATE items SET quantity = quantity + ? WHERE item_id = ?";
//         try (PreparedStatement stmt = conn.prepareStatement(updateQuery)) {
//             stmt.setInt(1, quantityToAdd);
//             stmt.setInt(2, itemId);

//             int rowsUpdated = stmt.executeUpdate();
//             System.out.println(rowsUpdated > 0 ? "Item restocked successfully" : "Item not found.");
//         } catch (SQLException e) {
//             System.out.println("Error during restock: " + e.getMessage());
//         }
//     }

//     public static void reduceStock(Connection conn, Scanner scanner) {
//         int itemId = scanner.nextInt();

//         int quantityToRemove = scanner.nextInt();

//         // Check if the quantity is positive
//         if (quantityToRemove <= 0) {
//             System.out.println("Quantity to remove must be positive.");
//             return;
//         }

//         String checkQuantityQuery = "SELECT quantity FROM items WHERE item_id = ?";
//         String updateQuery = "UPDATE items SET quantity = quantity - ? WHERE item_id = ?";

//         try (PreparedStatement checkStmt = conn.prepareStatement(checkQuantityQuery)) {
//             checkStmt.setInt(1, itemId);
//             ResultSet rs = checkStmt.executeQuery();

//             if (rs.next()) {
//                 int currentQuantity = rs.getInt("quantity");

//                 if (currentQuantity >= quantityToRemove) {
//                     try (PreparedStatement stmt = conn.prepareStatement(updateQuery)) {
//                         stmt.setInt(1, quantityToRemove);
//                         stmt.setInt(2, itemId);

//                         int rowsUpdated = stmt.executeUpdate();
//                         System.out.println(rowsUpdated > 0 ? "Stock reduced successfully" : "Failed to reduce stock.");
//                     }
//                 } else {
//                     System.out.println("Not enough stock to remove.");
//                 }
//             } else {
//                 System.out.println("Item not found.");
//             }
//         } catch (SQLException e) {
//             System.out.println("Error during stock reduction: " + e.getMessage());
//         }
//     }

//     public static void displayInventory(Connection conn) {
//         String displayQuery = "SELECT * FROM items ORDER BY item_id";
//         try (Statement stmt = conn.createStatement();
//              ResultSet rs = stmt.executeQuery(displayQuery)) {

//             System.out.println("ID | Name | Quantity | Price");
//             while (rs.next()) {
//                 System.out.printf("%d | %s | %d | %.2f%n",
//                         rs.getInt("item_id"),
//                         rs.getString("name"),
//                         rs.getInt("quantity"),
//                         rs.getDouble("price"));
//             }
//         } catch (SQLException e) {
//             System.out.println("Error displaying inventory: " + e.getMessage());
//         }
//     }

// }