import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // int size = num2 - num1 + 1;
        // int[] answer = new int[size];
        // for(int i=0; i<answer.length; i++) {
        //     answer[i] = numbers[num1 + i];
        // }
        
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}