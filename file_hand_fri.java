// import java.io.*;
// import java.util.Scanner;
// public class file_hand_fri {
//     public static void byter(String filename,String content){
//         try(FileOutputStream fis=new FileOutputStream(filename)){
//             fis.write(content.getBytes());
//         }catch(IOException e){
//             e.printStackTrace();
//         }
//     }
//     public static void charr(String filename,String content){
//         try(FileWriter fw=new FileWriter(filename)){
//             fw.write(content);
//         }catch(IOException e){
//             e.printStackTrace();
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String fis="FileInput.txt";
//         String fw="FileReader.txt";
//         String content="Hello Everyone I am now going to create file";
//         byter(fis,content);
//         charr(fw,content);
//     }
// }
// import java.io.*;
// public class file_hand_fri{
//     public static void byteread(String filename){
//         try(FileInputStream fis=new FileInputStream(filename)){
//             int data;
//             while((data=fis.read())!=-1){
//                 System.out.print((char) data);
//             }
//             System.out.println();
//         }
//         catch(IOException e){
//             e.printStackTrace();
//         }
//     }
//     public static void charead(String filename){
//        try(FileReader fw=new FileReader(filename)){
//         int data;
//         while((data=fw.read())!=-1){
//             System.out.print((char) data);
//         }
//        } 
//        catch(IOException e){
//         e.printStackTrace();
//        }
//     }
//     public static void main(String[] args){
//         String fis="FileInput.txt";
//        String fw="FileReader.txt";

//        byteread(fis);
//        charead(fw);
//     }
// }


// import java.io.*;
// class Student implements Serializable{
//     private static final long serialVersionUID = 1L; // Added serialVersionUID
//     String name;
//     int roll_no;
//     int marks;
//     Student(String name,int roll_no,int marks){
//         this.name=name;
//         this.roll_no=roll_no;
//         this.marks=marks;
//     }
//     public String toString(){
//         return "Name of Student is: "+name+" and his/her roll no is: "+roll_no+" and total marks secured by him in ete is: "+marks;
//     }
// }
// class file_hand_fri{
//     public static void main(String[] args){
//         try(FileOutputStream fos=new FileOutputStream("new.txt");
//         ObjectOutputStream oos=new ObjectOutputStream(fos)){
//             Student p1=new Student("Raghav",19,98);
//             oos.writeObject(p1);
//         }catch(IOException e){
//             e.printStackTrace();
//         }
//         try(FileInputStream fis=new FileInputStream("new.txt");
//         ObjectInputStream ois=new ObjectInputStream(fis)){
//             Student p1=(Student) ois.readObject();
//             System.out.print(p1);
//         }catch(IOException | ClassNotFoundException e){
//             e.printStackTrace();
//         }
//     }
// }




