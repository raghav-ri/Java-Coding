import java.io.*;
class Person implements Serializable{
    String name;
    int roll_no;
    Person(String n,int r){
        name=n;
        roll_no=r;
    }
    public String toString(){
        return "Name is: "+name+" and Roll no is: "+roll_no;
    }
}
public class serial_deserial {
    public static void main(String[] args){
        try(ObjectOutputStream oob=new ObjectOutputStream(new FileOutputStream("raghav.txt"))){
            Person person=new Person("Raghav",19);
            oob.writeObject(person);
        }catch(IOException e){
            e.printStackTrace();
        }
        try(ObjectInputStream oop=new ObjectInputStream(new FileInputStream("raghav.txt"))){
            Person person=(Person) oop.readObject();
            System.out.println(person);
        }catch(IOException |ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
