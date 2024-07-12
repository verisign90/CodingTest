class Solution {
    public int solution(int n) {
        String num = String.valueOf(n);
        int sum = 0;
        for(int i=0; i<num.length(); i++) {
            sum += num.charAt(i) - '0';
            //sum += Integer.parseInt(num.substring(i, i+1));
        }
        return sum;
    }
}