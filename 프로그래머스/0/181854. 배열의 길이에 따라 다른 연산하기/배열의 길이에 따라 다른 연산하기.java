class Solution {
    public int[] solution(int[] arr, int n) {
        int length = arr.length;
        
        if(length % 2 != 0) {
            for(int i=0; i<arr.length; i+=2) {
                arr[i] = arr[i] + n;
            }
        } else {
            for(int i=1; i<arr.length; i+=2) {
                arr[i] = arr[i] + n;
            }
        }
        
        return arr;
    }
}