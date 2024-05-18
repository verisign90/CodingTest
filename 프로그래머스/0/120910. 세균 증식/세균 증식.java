class Solution {
    public int solution(int n, int t) {
        //return (int) Math.pow(2, t) * n;
        
        for(int i=0; i<t; i++) {
            n *= 2;
        }
        
        return n;
    }
}