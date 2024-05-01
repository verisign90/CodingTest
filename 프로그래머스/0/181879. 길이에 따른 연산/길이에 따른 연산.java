class Solution {
    public int solution(int[] num_list) {
//         int answer;
    
//         if(num_list.length >= 11) {
//             answer = 0;
//             for(int i=0; i<num_list.length; i++) {
//                 answer += num_list[i];
//             }
//         } else {
//             answer = 1;
//             for(int i=0; i<num_list.length; i++) {
//                 answer *= num_list[i];
//             }
//         }
        
//         return answer;
        
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        
//         int sum = 0;
//         int mul = 1;
//         int answer;
        
//         for(int i=0; i<num_list.length; i++) {
//             if(num_list.length >= 11) {
//                 sum += num_list[i];
//                 answer = sum;
//             } else {
//                 mul *= num_list[i];
//                 answer = mul;
//             }
//         }
        
//         return answer;
        
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        
        int sum = 0;
        int mul = 1;
        int answer;
        
        for(int i=0; i<num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }
        
        answer = (num_list.length >= 11) ? sum : mul;
        
        return answer;
    }
}    