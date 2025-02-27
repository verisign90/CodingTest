class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        for(int num : num_list) {
            int count = 0;
            while(num > 1) {
                if(num %2 == 0) {
                    num /= 2;
                } else {
                    num = (num-1) / 2;
                }
                count++;
            }
            sum += count;
        }
        return sum;
    }
}