// import java.util.*;
// import java.text.*;
// // You are using Java
// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// class Task implements Comparable<Task> {
//     //type your code here
//     String name;
//     String deadline;
//     int prior;
//     Task(String n,String d,int p){
//         name=n;
//         deadline=d;
//         prior=p;
//     }
//     public int compareTo(Task other){
//         DateTimeFormatter dd=DateTimeFormatter.ofPattern("yyyy-MM-dd");
//         LocalDate thisdate=LocalDate.parse(this.deadline,dd);
//         LocalDate otherdate=LocalDate.parse(other.deadline,dd);
//         int diff=thisdate.compareTo(otherdate);
//         if(diff!=0){
//         return thisdate.compareTo(otherdate);
//         }
//         return Integer.compare(this.prior,other.prior);
        
//     }
//     public String toString(){
//         return (name+" "+deadline+" "+prior);
//     }
   
// }
// class TaskManager {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt();
//         scanner.nextLine();
//         TreeSet<Task> tasks = new TreeSet<>();
//         for (int i = 0; i < N; i++) {
//             String name = scanner.next();
//             String deadline = scanner.next();
//             int priority = scanner.nextInt();
//             tasks.add(new Task(name, deadline, priority));
//         }
//         scanner.close();
//         for (Task task : tasks) {
//             System.out.println(task);
//         }
//     }
// }