class Solution {
    public int[] solution(int n) {
//         int count = 0;
//         for(int i=1; i<=n; i++) {
//             if(i % 2 == 1) {
//                 count++;
//             }
//         }
        
//         int[] answer = new int[count];
//         int index = 0;
//         for(int i=1; i<=n; i++) {
//             if(i % 2 == 1) {
//                 answer[index++] = i;
//             }
//         }
        
//         return answer;
        
        int size = (n + 1) / 2;
        int[] answer = new int[size];
        for(int i=0; i<size; i++) {
            answer[i] = 2 * i + 1;
        }
        
        return answer;
    }
}