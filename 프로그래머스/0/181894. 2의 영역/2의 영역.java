import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
//         List<Integer> list = new ArrayList<>();
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i] == 2) {
//                 list.add(i);
//             }
//         }
        
//         if(list.isEmpty()) {
//             return new int[]{-1};
//         }
        
//         int begin = list.get(0);
//         int end = list.get(list.size()-1);
        
//         return Arrays.copyOfRange(arr, begin, end+1);
        
        int min = arr.length;
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
        
        if(min <= max) {
            return Arrays.copyOfRange(arr, min, max+1);
        } else {
            return new int[]{-1};
        }
    }
}