class Solution {
    public int[] solution(int[] array) {
        int answer = 0;
        int index = 0;
        
        for(int i=0; i<array.length; i++) {
            if(array[i] > answer) {
                answer = array[i];
                index = i;
            }
        }
        
        int[] ans = new int[2];
        ans[0] = answer;
        ans[1] = index;
        
        return ans;
    }
}