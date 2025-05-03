// import java.util.*;
// class AnagramGrouper {
//     public static List<List<String>> groupAnagrams(String[] words) {
//         Map<String, List<String>> map = new HashMap<>();
        
//         for (String word : words) {
//             char[] chars = word.toCharArray();
//             Arrays.sort(chars);
//             String key = new String(chars);
            
//             if (!map.containsKey(key)) {
//                 map.put(key, new ArrayList<>());
//             }
//             map.get(key).add(word);
//         }

//         List<List<String>> result = new ArrayList<>(map.values());

//         for (List<String> group : result) {
//             Collections.sort(group);
//         }
        

//         Collections.sort(result, (a, b) -> a.get(0).compareTo(b.get(0)));
        
//         return result;
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt();
//         String[] words = new String[N];
        
//         for (int i = 0; i < N; i++) {
//             words[i] = scanner.next();
//         }
        
//         List<List<String>> result = AnagramGrouper.groupAnagrams(words);
        
//         for (List<String> group : result) {
//             for (String word : group) {
//                 System.out.print(word + " ");
//             }
//             System.out.println();
//         }
        
//         scanner.close();
//     }
// }