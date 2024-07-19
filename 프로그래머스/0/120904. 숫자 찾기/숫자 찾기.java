class Solution {
    public int solution(int num, int k) {
        // String[] arr = Integer.toString(num).split("");
        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i].equals(Integer.toString(k))) {
        //         return i+1;
        //     }
        // }
        // return -1;
        
        String str = Integer.toString(num);
        char ch = (char)('0' + k);
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ch) {
                return i+1;
            }
        }
        return -1;
    }
}