import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a = intervals[0][1] - intervals[0][0];
        int b = intervals[1][1] - intervals[1][0];
        
        int[] answer = new int[a+b+2];
        int index = 0;
        
//         for(int i=intervals[0][0]; i<=intervals[0][1]; i++) {
//             answer[index++] = arr[i];
//         }
//         for(int i=intervals[1][0]; i<=intervals[1][1]; i++) {
//             answer[index++] = arr[i];
//         }
        
        for(int i=0; i<intervals.length; i++) {
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++) {
                answer[index++] = arr[j];
            }
        }
        
        return answer;
        
//         List<Integer> list = new ArrayList<>();
        
//         for(int i=0; i<intervals.length; i++) {
//             for(int j=intervals[i][0]; j<=intervals[i][1]; j++) {
//                 list.add(arr[j]);
//             }
//         }
        
//         int[] answer = new int[list.size()];
//         for(int i=0; i<answer.length; i++) {
//             answer[i] = list.get(i);
//         }
        
//         return answer;
    }
}