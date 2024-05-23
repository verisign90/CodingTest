class Solution {
    public int solution(int n) {
        //double sqrt = Math.sqrt(n);
        
        if(Math.sqrt(n) % 1 == 0) {
            return 1;
        }
        return 2;
    }
}