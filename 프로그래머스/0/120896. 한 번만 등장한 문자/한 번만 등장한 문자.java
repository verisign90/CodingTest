import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
//         String[] arr = s.split("");
//         Arrays.sort(arr);
//         StringBuilder sb = new StringBuilder();
        
//         for(int i=0; i<arr.length; i++) {
//             int count = 0;
//             for(int j=0; j<arr.length; j++) {
//                 if(arr[i].equals(arr[j])) {
//                     count++;
//                 }
//             }
            
//             if(count == 1) {
//                 sb.append(arr[i]);
//             }
//         }
//         return sb.toString();
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        List<Character> list = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for(char c : list) {
            sb.append(c);
        }
        return sb.toString();
        // return list.stream()
        //            .map(String::valueOf)
        //            .collect(Collectors.joining());
    }
}