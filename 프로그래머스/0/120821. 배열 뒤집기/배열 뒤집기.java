import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
//         List<Integer> list = new ArrayList<>();
//         for(int i=num_list.length-1; i>=0; i--) {
//             list.add(num_list[i]);
//         }
        
//         int[] answer = new int[list.size()];
//         for(int i=0; i<answer.length; i++) {
//             answer[i] = list.get(i);
//         }
        
//         return answer;
        
        int[] answer = new int[num_list.length];
        int index = 0;
        for(int i=num_list.length-1; i>=0; i--) {
            answer[index++] = num_list[i];
        }
        return answer;
    }
}