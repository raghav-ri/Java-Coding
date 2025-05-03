// import java.util.*;
// public class hashmap_deque {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         sc.nextLine();
//         Map<String,Integer> hmp=new HashMap<>();
//         for(int i=0;i<a;i++){
//             String name=sc.nextLine();
//             int age=sc.nextInt();
//             sc.nextLine();
//             hmp.put(name,age);
//         }
//         for(var i:hmp.entrySet()){
//             System.out.println("Name is: "+i.getKey()+" and age is: "+i.getValue());
//         }

//     }
    
// }containsKey(), containsValue(), hmp.keySet(),hmp.values(), hmp.size(),hmp.clear(),
// freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);


// WAP using HashMap to count the frequency of element in the array
// import java.util.*;
// class hashmap_deque{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int[] arr=new int[a];
//         for(int i=0;i<a;i++){
//             arr[i]=sc.nextInt();
//         }
//         Map<Integer,Integer> hmp=new HashMap<>();
//         for(int num:arr){
//             hmp.put(num,hmp.getOrDefault(num,0)+1);
//         }
//         for(var i:hmp.entrySet()){
//             System.out.println("Elements "+i.getKey()+" is present "+i.getValue()+"times");
//         }
//     }
// }




// Deque

// Here are the different methods of `Deque` (Double-Ended Queue) in Java, explained point-wise:

// ---

// ### 1. **Adding Elements**
// - **`addFirst(E e)`**: Inserts the element at the front of the deque.
//   ```java
//   deque.addFirst(10); // Adds 10 to the front
//   ```

// - **`addLast(E e)`**: Inserts the element at the end of the deque.
//   ```java
//   deque.addLast(20); // Adds 20 to the end
//   ```

// - **`offerFirst(E e)`**: Inserts the element at the front of the deque. Returns `true` if successful, `false` otherwise.
//   ```java
//   deque.offerFirst(30); // Adds 30 to the front
//   ```

// - **`offerLast(E e)`**: Inserts the element at the end of the deque. Returns `true` if successful, `false` otherwise.
//   ```java
//   deque.offerLast(40); // Adds 40 to the end
//   ```

// ---

// ### 2. **Removing Elements**
// - **`removeFirst()`**: Removes and returns the first element of the deque. Throws an exception if the deque is empty.
//   ```java
//   int first = deque.removeFirst(); // Removes the first element
//   ```

// - **`removeLast()`**: Removes and returns the last element of the deque. Throws an exception if the deque is empty.
//   ```java
//   int last = deque.removeLast(); // Removes the last element
//   ```

// - **`pollFirst()`**: Removes and returns the first element of the deque, or `null` if the deque is empty.
//   ```java
//   Integer first = deque.pollFirst(); // Removes the first element or returns null
//   ```

// - **`pollLast()`**: Removes and returns the last element of the deque, or `null` if the deque is empty.
//   ```java
//   Integer last = deque.pollLast(); // Removes the last element or returns null
//   ```

// ---

// ### 3. **Accessing Elements**
// - **`getFirst()`**: Retrieves the first element without removing it. Throws an exception if the deque is empty.
//   ```java
//   int first = deque.getFirst(); // Retrieves the first element
//   ```

// - **`getLast()`**: Retrieves the last element without removing it. Throws an exception if the deque is empty.
//   ```java
//   int last = deque.getLast(); // Retrieves the last element
//   ```

// - **`peekFirst()`**: Retrieves the first element without removing it, or `null` if the deque is empty.
//   ```java
//   Integer first = deque.peekFirst(); // Retrieves the first element or null
//   ```

// - **`peekLast()`**: Retrieves the last element without removing it, or `null` if the deque is empty.
//   ```java
//   Integer last = deque.peekLast(); // Retrieves the last element or null
//   ```

// ---

// ### 4. **Checking and Searching**
// - **`isEmpty()`**: Checks if the deque is empty.
//   ```java
//   boolean empty = deque.isEmpty(); // Returns true if empty
//   ```

// - **`contains(Object o)`**: Checks if the deque contains the specified element.
//   ```java
//   boolean exists = deque.contains(10); // Returns true if 10 exists
//   ```

// ---

// ### 5. **Iteration**
// - **`iterator()`**: Returns an iterator to traverse the deque from front to back.
//   ```java
//   for (int num : deque) {
//       System.out.println(num);
//   }
//   ```

// - **`descendingIterator()`**: Returns an iterator to traverse the deque from back to front.
//   ```java
//   Iterator<Integer> it = deque.descendingIterator();
//   while (it.hasNext()) {
//       System.out.println(it.next());
//   }
//   ```

// ---

// ### 6. **Size and Clearing**
// - **`size()`**: Returns the number of elements in the deque.
//   ```java
//   int size = deque.size(); // Returns the size of the deque
//   ```

// - **`clear()`**: Removes all elements from the deque.
//   ```java
//   deque.clear(); // Clears the deque
//   ```

// ---

// ### Example Code:
// ```java
// import java.util.*;

// public class DequeExample {
//     public static void main(String[] args) {
//         Deque<Integer> deque = new ArrayDeque<>();

//         // Adding elements
//         deque.addFirst(10);
//         deque.addLast(20);
//         deque.offerFirst(5);
//         deque.offerLast(25);

//         // Accessing elements
//         System.out.println("First Element: " + deque.getFirst());
//         System.out.println("Last Element: " + deque.getLast());

//         // Removing elements
//         deque.removeFirst();
//         deque.removeLast();

//         // Iterating
//         System.out.println("Deque elements:");
//         for (int num : deque) {
//             System.out.println(num);
//         }
//     }
// }
// ```

// ### Output:
// ```
// First Element: 5
// Last Element: 25
// Deque elements:
// 10
// 20
// ```