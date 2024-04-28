// class Solution {
//     public int[] solution(int[] num_list) {
//         for(int i=0; i<num_list.length / 2; i++) {
//             int temp = num_list[i];
//             num_list[i] = num_list[num_list.length-1-i];
//             num_list[num_list.length-1-i] = temp;
//         }
//         return num_list;
//     }
// }

class Solution {
    public int[] solution(int[] num_list) {
        int[] reverse = new int[num_list.length];
        for(int i=0; i<num_list.length; i++) {
            reverse[i] = num_list[num_list.length-1-i];
        }
        return reverse;
    }
}

