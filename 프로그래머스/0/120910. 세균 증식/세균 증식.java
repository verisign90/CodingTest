class Solution {
    public int solution(int n, int t) {
//         for(int i=0; i<t; i++) {
//             n *= 2;
//         }
//         return n;
        
         //return n * (1 << t);
        
        return (int)(n * Math.pow(2, t));
    }
}