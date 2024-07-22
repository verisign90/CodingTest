import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[a-z]", "");
        int[] answer = new int[str.length()];
        for(int i=0; i<str.length(); i++) {
            answer[i] = str.charAt(i) - '0';
            //answer[i] = Integer.parseInt(str.charAt(i));
        }
        Arrays.sort(answer);
        return answer;
    }
}