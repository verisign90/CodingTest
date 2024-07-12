class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        
        //if(sqrt == (int)sqrt) {
        if(sqrt % 1 == 0) {
            return 1;
        }
        return 2;
    }
}