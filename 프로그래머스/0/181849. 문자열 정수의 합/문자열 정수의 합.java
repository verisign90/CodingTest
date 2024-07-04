class Solution {
    public int solution(String num_str) {
        // int sum = 0;
        // char[] arr = num_str.toCharArray();
        // for(int i=0; i<arr.length; i++) {
        //     sum += arr[i] - '0';
        // }
        // return sum;
        
        int sum = 0;
        for(int i=0; i<num_str.length(); i++) {
            sum += Character.getNumericValue(num_str.charAt(i));
        }
        
        return sum;
    }
}