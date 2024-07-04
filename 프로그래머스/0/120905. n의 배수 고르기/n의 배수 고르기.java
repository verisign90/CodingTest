import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
//         List<Integer> list = new ArrayList<>();
        
//         for(int num : numlist) {
//             if(num % n == 0) {
//                 list.add(num);
//             }
//         }
        
//         int[] answer = new int[list.size()];
//         for(int i=0; i<answer.length; i++) {
//             answer[i] = list.get(i);
//         }
        
//         return answer;
        
        int[] answer = new int[numlist.length];
        int index = 0;
        
        for(int num : numlist) {
            if(num % n == 0) {
                answer[index++] = num;
            }
        }
        
        return Arrays.copyOf(answer, index);
    }
}