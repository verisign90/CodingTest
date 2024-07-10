import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
//         int[] first = Arrays.copyOfRange(num_list, 0, n);   //2
//         int[] second = Arrays.copyOfRange(num_list, n, num_list.length);    //1, 6
        
//         int[] answer = new int[num_list.length];
        
//         System.arraycopy(first, 0, answer, second.length, first.length);    //x, x, 2
//         System.arraycopy(second, 0, answer, 0, second.length);
//         return answer;
        
        int[] answer = new int[num_list.length];
        int index = 0;
        for(int i=n; i<num_list.length; i++) {  //1, 6
            answer[index++] = num_list[i];  //[0]=1, [1]=6
        }
        
        for(int i=0; i<n; i++) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}