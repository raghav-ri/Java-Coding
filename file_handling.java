import java.io.*;
public class file_handling {
    public static void main(String[] args){
        try(FileInputStream fis=new FileInputStream("input_binary.dat");
        FileOutputStream fos=new FileOutputStream("output_binary.dat")){
            int data;
            while((data=fis.read())!=-1){
                fos.write(data);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

        try(FileReader fr=new FileReader("reader.txt");
        FileWriter fw=new FileWriter("wruter.txt")){
            int data;
            while((data=fr.read())!=-1){
                fw.write(data);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
