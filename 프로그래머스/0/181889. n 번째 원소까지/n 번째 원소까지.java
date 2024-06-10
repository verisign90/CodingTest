class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        
        // for(int i=0; i<num_list.length; i++) {
        //     answer[i] = num_list[i];
        //     if(i == n-1) {
        //         break;
        //     }
        // }
        //return answer;
        
        for(int i=0; i<n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}