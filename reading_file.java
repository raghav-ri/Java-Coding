// import java.io.*;
// public class reading_file {
//     public static void readbyt(String filename){
//         try(FileInputStream fis=new FileInputStream(filename)){
//             int data;
//             while((data=fis.read())!=-1){
//                 System.out.println((char)data);
//             }
//             System.out.println();
//         }catch(IOException e){
//             e.printStackTrace();
//         }
//     }
//     public static void readcharc(String filename){
//         try(FileReader fw=new FileReader(filename)){
//             int data;
//             while((data=fw.read())!=-1){
//                 System.out.print((char) data);

//             }
//             System.out.println();
//         }catch(IOException e){
//             e.printStackTrace();
//         }
//     }
//     public static void main(String[] args){
//         String fis="bytewise.txt";
//         String fw="characterwise.txt";
//         readbyt(fis);
//         readcharc(fw);
//     }
// }
import java.io.*;
public class reading_file {
    public static void readbr(String filename){
        try(BufferedReader br=new BufferedReader(new FileReader(filename))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        String filename="characterwise.txt";
        readbr(filename);
    }
}
