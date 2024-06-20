import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        for(int i=0; i<num_list.length / 2; i++) {
            int temp = num_list[i];
            num_list[i] = num_list[num_list.length-1-i];
            num_list[num_list.length-1-i] = temp;
        }
        return num_list;

        // int[] reverse = new int[num_list.length];
        // for(int i=0; i<num_list.length; i++) {
        //     reverse[i] = num_list[num_list.length-1-i];
        // }
        // return reverse;
        
        // List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        // Collections.reverse(list);
        // return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

