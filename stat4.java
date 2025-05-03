// import java.util.Scanner;
// import java.util.ArrayList;
// class RotationCounter {
//     public int countRotations(ArrayList<Integer> arr) {
//         int low = 0;
//         int high = arr.size() - 1;
//         int n = arr.size();
        
//         while (low <= high) {
//             if (arr.get(low) <= arr.get(high)) {
//                 return low;
//             }
            
//             int mid = (low + high) / 2;
//             int next = (mid + 1) % n;
//             int prev = (mid + n - 1) % n;
            
//             if (arr.get(mid) <= arr.get(next) && arr.get(mid) <= arr.get(prev)) {
//                 return mid;
//             }
            
//             if (arr.get(mid) <= arr.get(high)) {
//                 high = mid - 1;
//             } else if (arr.get(mid) >= arr.get(low)) {
//                 low = mid + 1;
//             }
//         }
        
//         return -1;
//     }
// }
// class CountRotationsInSortedArray {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         int n = scanner.nextInt();
//         ArrayList<Integer> arr = new ArrayList<>();
        
//         for (int i = 0; i < n; i++) {
//             arr.add(scanner.nextInt());
//         }
        
//         RotationCounter counter = new RotationCounter();
//         int rotations = counter.countRotations(arr);
        
//         System.out.println("The number of rotations in the array is: "+rotations);
        
//         scanner.close();
//     }
// }