class Solution {
    public int solution(int n) {
        int sum = 0;
        int sum2 = 0;
        if(n % 2 == 1) {
            for(int i=1; i<=n; i+=2) {
                sum += i;
            }
            return sum;
        } else {
            for(int i=2; i<=n; i+=2) {
                sum2 += i * i;
            }
        return sum2;
        }
    }
}    
    