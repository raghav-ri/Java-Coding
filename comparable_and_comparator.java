// import java.util.*;
// class People implements Comparable<People>{
//     String name;
//     int age;
//     People(String n,int a){
//         name=n;
//         age=a;
//     }
//     public int compareTo(People other){
//         if(this.age!=other.age){
//             return Integer.compare(this.age,other.age);
//         }else{
//             return this.name.compareTo(other.name);
//         }
//     }
//     public String toString(){
//         return "Name of the Person is: "+name+" and their age is: "+age;
//     }
// }
// public class comparable_and_comparator {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=5;
//         TreeSet<People> tst=new TreeSet<>();
//         for(int i=0;i<a;i++){
//             String name=sc.nextLine();
//             int age=sc.nextInt();
//             sc.nextLine();
//             tst.add(new People(name,age));
//         }
//         for(People people:tst){
//             System.out.println(people);
//         }
//         sc.close();
//     }
// }









// import java.util.*;
// class People implements Comparable<People>{
//     String name;
//     int age;
//     People(String n,int a){
//         name=n;
//         age=a;
//     }
//     public int compareTo(People other){
//         if(this.age!=other.age){
//             return Integer.compare(this.age,other.age);
//         }else{
//             return this.name.compareTo(other.name);
//         }
//     }
//     public String toString(){
//         return "Name of the Person is: "+name+" and their age is: "+age;
//     }
// }
// public class comparable_and_comparator {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=5;
//         ArrayList<People> tst=new ArrayList<>();
//         for(int i=0;i<a;i++){
//             String name=sc.nextLine();
//             int age=sc.nextInt();
//             sc.nextLine();
//             tst.add(new People(name,age));
//         }
//         Collections.sort(tst);
//         for(People people:tst){
//             System.out.println(people);
//         }
//         sc.close();
//     }
// }





// import java.util.*;
// class Touch{
//     String cust_id;
//     int reg_no;
//     int pin;
//     Touch(String c,int r,int p){
//         cust_id=c;
//         reg_no=r;
//         pin=p;
//     }
//     public String toString(){
//         return "The Reg_no of the Student is: "+reg_no+" and their unique id is:"+cust_id+" and their to pin to access the touch is "+pin;
//     }
// }
// class RegComp implements Comparator<Touch>{
//     public int compare(Touch t1,Touch t2){
//         if(t1.reg_no!=t2.reg_no){
//             return Integer.compare(t1.reg_no,t2.reg_no);
//         }else{
//             return t1.cust_id.compareTo(t2.cust_id);
//         }
//     }

// }
// public class comparable_and_comparator{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         TreeSet<Touch> tst=new TreeSet<>(new RegComp());
//         int a=2;
//         for(int i=0;i<a;i++){
//             String cust_id=sc.nextLine();
//             int reg_no=sc.nextInt();
//             int pin=sc.nextInt();
//             sc.nextLine();
//             tst.add(new Touch(cust_id,reg_no,pin));

//         }
//         for(Touch touch:tst){
//             System.out.println(touch);
//         }
//         sc.close();
//     }
// }