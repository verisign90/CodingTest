class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int beDiff = Math.abs(n - array[0]);
        
        for(int i=1; i<array.length; i++) {
            int afDiff = Math.abs(n - array[i]);
            if(afDiff < beDiff) {
                answer = array[i];
                beDiff = afDiff;
            } else if(afDiff == beDiff && array[i] < answer) {
                answer = array[i];
            }
        }
        return answer;     
    }
}