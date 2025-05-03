import java.io.*;
public class creating_file_writing {
    public static void bytew(String filename,String content){
        try(FileOutputStream fos=new FileOutputStream(filename)){
            fos.write(content.getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void charw(String filename,String content){
        try(FileWriter fw=new FileWriter(filename)){
            fw.write(content);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        String bytewise="bytewise.txt";
        String charwise="characterwise.txt";
        String content="HELLO TO THE BEAUTIFUL WORLD OF FILE HANDLING MR RAGHAV KUMAR ISSAR";
        bytew(bytewise,content);
        charw(charwise,content);
    }
}
