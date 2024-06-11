import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
//         int[] array1 = Arrays.copyOfRange(num_list, 0, n); //0부터 2까지. [5, 2, 1]
//         int[] array2 = Arrays.copyOfRange(num_list, n, num_list.length); //3부터 4까지. [7, 5]
        
//         int[] result = new int[num_list.length];  //num_list.length = 5, n=3
//         System.arraycopy(array1, 0, result, array2.length, array1.length); //[0, 0, 5, 2, 1]
//         System.arraycopy(array2, 0, result, 0, array2.length); //[7, 5, 5, 2, 1]
        
//         return result;
    
        int[] answer = new int[num_list.length];
        int index = 0;
        
        for(int i=n; i<num_list.length; i++) {
            answer[index++] = num_list[i];  //[0] = 7, [1] = 5
        }
        
        for(int i=0; i<n; i++) {
            answer[index++] = num_list[i];  //[2] = 5, [3] = 2, [4] = 1
        }
        
        return answer;
    }
}