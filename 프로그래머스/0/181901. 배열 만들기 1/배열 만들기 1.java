import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
//         List<Integer> list = new ArrayList<>();
        
//         for(int i=1; i<=n; i++) {
//             if(i % k == 0) {
//                 list.add(i);
//             }
//         }
        
//         int[] answer = new int[list.size()];
//         for(int i=0; i<list.size(); i++) {
//             answer[i] = list.get(i);
//         }
        
//         return answer;
        
        int[] answer = new int[n/k];
        
        for(int i=1; k * i<=n; i++) {
            answer[i-1] = k * i;
        }
        
        return answer;
        
//         int[] answer = new int[n/k];
//         int index = 0;
        
//         for(int i=1; i<=n; i++) {
//             if(i % k == 0) {
//                 answer[index] = i;
//                 index++;
//             }
//         }
        
//         return answer;
    }
}