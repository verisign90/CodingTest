import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        for(int ar : arr) {
            list.add(ar);
        }
        
//         for(int del : delete_list) {
//             list.remove(Integer.valueOf(del));
//         }
        
//         return list.stream().mapToInt(Integer::intValue).toArray();
        
        // for(int i=0; i<arr.length; i++) {
        //     for(int j=0; j<delete_list.length; j++) {
        //         if(arr[i] == delete_list[j]) {
        //             list.remove(Integer.valueOf(delete_list[j]));
        //         }
        //     }
        // }
        
        for(int i : arr) {
            for(int j : delete_list) {
                if(i == j) {
                    list.remove(Integer.valueOf(j));
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}