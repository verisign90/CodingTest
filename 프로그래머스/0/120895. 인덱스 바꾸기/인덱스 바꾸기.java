import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] answer = my_string.toCharArray();
        
//         char temp = answer[num1];
//         answer[num1] = answer[num2];
//         answer[num2] = temp;
//         return new String(answer);
        
        answer[num1] = my_string.charAt(num2);
        answer[num2] = my_string.charAt(num1);
        return String.valueOf(answer);
        
        // List<String> list = new ArrayList<>(List.of(my_string.split("")));
        // Collections.swap(list, num1, num2);
        // return String.join("", list);
    }
}