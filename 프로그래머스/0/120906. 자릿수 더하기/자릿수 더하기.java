class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        
        int answer = 0;
        for(int i=0; i<str.length(); i++) {
            //answer += Character.getNumericValue(str.charAt(i));
            answer += Integer.parseInt(str.substring(i, i+1));
        }
        
//         while(n > 0) {
//             answer += n % 10;
//             n /= 10;
//         }
        
         return answer;
    }
}