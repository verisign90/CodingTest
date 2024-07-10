import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<num_list.length; i+=n) {
            list.add(num_list[i]);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
//         int[] answer;
//         if(num_list.length % n == 0) {
//             answer = new int[num_list.length / n];
//         } else {
//             answer = new int[num_list.length / n + 1];
//         }
        
//         int index = 0;
//         for(int i=0; i<num_list.length; i+=n) {
//             answer[index++] = num_list[i]; 
//         }
        return answer;
    }
}