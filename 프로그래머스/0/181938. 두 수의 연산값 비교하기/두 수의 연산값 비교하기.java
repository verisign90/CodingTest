class Solution {
    public int solution(int a, int b) {
        int plus = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int multi = 2 * a * b;
        
        // if(plus < multi) {
        //     return multi; 
        // } else if(plus == multi) {
        //     return plus;
        // } else {
        //     return plus;
        // }
        
        if(plus == multi) {
            return plus;
        } else {
            return Math.max(plus, multi);
        }
    }
}