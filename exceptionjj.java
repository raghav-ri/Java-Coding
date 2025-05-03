// public class exceptionjj {
//     public static void main(String[] args){
//         try{
//             System.out.println(5/0);
//         }
//         catch(ArithmeticException e){
//             System.err.println("There is error"+e.getMessage());
//         }finally{
//             System.out.println("This will always work");
//         }
//     }
// }







//     custom exception
// class CustomException extends Exception{
//     public CustomException(String mess){
//         super(mess);
//     }
// }

// public class exceptionjj{
//     public static void main(String[] args){
//         try{
//             throw new CustomException("This is custom exception");
//         }catch(CustomException e){
//             System.err.println("ERROR"+e.getMessage());
//         }
//     }
// }




// real life example
// import java.util.*;
// class InvalidAgeException extends Exception{
//     public InvalidAgeException(String mess){
//         super(mess);
//     }
// }
// class exceptionjj{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         try{
//             validate(age);
//             System.out.println("Person X is allowed to vote");
//         }catch(InvalidAgeException e){
//             System.err.println("Person X cant cast their vote"+e.getMessage());
//         }
//     }
//     public static void validate(int age) throws InvalidAgeException{
//         if(age<18){
//             throw new InvalidAgeException("Voter is minor");
//         }
//     }
// }





// assertion
// class exceptionjj{
//     public static void main(String[] args){
//         int a=-1;
//         assert a>0;
//     }
// }





// throws and throw  
import java.io.*;

public class exceptionjj {
    public static void main(String[] args) {
        try {
            readFile(); // Call the method
        } catch (IOException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }

    // Declare that this method might throw an IOException
    public static void readFile() throws IOException {
        throw new IOException("File not found.");
    }
}