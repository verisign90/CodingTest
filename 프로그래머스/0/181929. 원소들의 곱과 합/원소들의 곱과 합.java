class Solution {
    public int solution(int[] num_list) {
        int times = 1;
        int sum = 0;
        for(int num : num_list) {
            times *= num;
            sum += num;
        }
        
        if(times < sum * sum) {
            return 1;
        }
        return 0;
        
    }
}