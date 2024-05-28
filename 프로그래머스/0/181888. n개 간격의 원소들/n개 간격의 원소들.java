import java.util.List;
import java.util.ArrayList;

class Solution {
//     public List solution(int[] num_list, int n) {
//         List<Integer> answer = new ArrayList<>();
        
//         for(int i=0; i<num_list.length; i+=n) {
//             answer.add(num_list[i]);
//         }
        
//         return answer;
//     }
    
    public int[] solution(int[] num_list, int n) {
        int size = (int)Math.ceil((double)num_list.length / n);
        int[] answer = new int[size];
        int index = 0;
        
        for(int i=0; i<num_list.length; i+=n) {
            answer[index++] = num_list[i];    
        }
        
        return answer;
        
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int i=0; i<num_list.length; i+=n) {
//             list.add(num_list[i]);
//         }

//         int[] answer = new int[list.size()];
        
//         for(int i=0; i<answer.length; i++) {
//             answer[i] = list.get(i);
//         }
        
//         return answer;
    }
}