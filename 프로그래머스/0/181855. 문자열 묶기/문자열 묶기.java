import java.util.*;

class Solution {
    public int solution(String[] strArr) {
//         Map<Integer, Integer> map = new HashMap<>();
        
//         for(String s : strArr) {
//             int length = s.length();
//             map.put(length, map.getOrDefault(length, 0) + 1);
//         }
        
//         int answer = 0;
//         for(int count : map.values()) {
//             if(count > answer) {
//                 answer = count;
//             }
//         }
        
//         return answer;
        
        int[] answer = new int[30];
        for(String s : strArr) {
            answer[s.length()-1]++;
        }
        
        int max = 0;
        for(int count : answer) {
            if(count > max) {
                max = count;
            }
        }
        
        return max;
    }
}