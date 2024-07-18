class Solution {
    public int solution(int order) {
        String num = String.valueOf(order);
        int count = 0;
        
        for(int i=0; i<num.length(); i++) {
            char ch = num.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9') {
                count++;
            }
        }
        return count;
    }
}