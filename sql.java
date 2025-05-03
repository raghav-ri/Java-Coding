// // You are using Java
// import java.sql.*;
// class Main{
// static String url="jdbc:mysql://localhost/ri_db";
// static String user="test";
// static String pass="test123";
//     public static void main(String[] args){
//         try(Connection con=DriverManager.getConnection(url,user,pass)){
//             Statement st=con.createStatement();
//             String q="create table product(ID int,Name varchar(100),Price float);";
//             st.executeUpdate(q);
            
//             q="insert into product values(101,'TV',1200),(102,'Mobile',1500)";
//             st.executeUpdate(q);
            
//             q="Select * from product;";
//             ResultSet rs=st.executeQuery(q);
            
//             while(rs.next()){
//                 System.out.println("ID is "+rs.getInt("ID")+"Product Name is "+rs.getString("Name")+rs.getFloat("Price"));
//             }
//         }
//         catch(SQLException e){
//             e.printStackTrace();
//         }
//     }
// }










// import java.sql.*;

// class Main {
//     static String url = "jdbc:mysql://localhost/ri_db";
//     static String user = "test";
//     static String pass = "test123";

//     public static void main(String[] args) {
//         try (Connection con = DriverManager.getConnection(url, user, pass)) {
//             Statement st = con.createStatement();

           
//             String q = "CREATE TABLE IF NOT EXISTS product(ID INT, Name VARCHAR(100), Price FLOAT);";
//             st.executeUpdate(q);

            
//             q = "INSERT INTO product VALUES " +
//                 "(101, 'TV', 120000), " +
//                 "(102, 'Mobile', 150000), " +
//                 "(103, 'HeadPhone', 49500), " +
//                 "(104, 'Bluetooth', 45000), " +
//                 "(105, 'AC', 750000)";
//             st.executeUpdate(q);

//             q = "UPDATE product SET Price = Price + 500;";
//             st.executeUpdate(q);

            
//             q = "SELECT * FROM product;";
//             ResultSet rs = st.executeQuery(q);

           
//             while (rs.next()) {
//                 float price = rs.getFloat("Price");
//                 if (price > 50000) {
//                     System.out.println("ID is " + rs.getInt("ID") + 
//                         " | Product Name is " + rs.getString("Name") + 
//                         " | Price is " + price);
//                 }
//             }

//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }
// }
