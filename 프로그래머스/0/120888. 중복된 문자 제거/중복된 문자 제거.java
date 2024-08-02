import java.util.*;

class Solution {
    public String solution(String my_string) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for(int i=0; i<my_string.length(); i++) {
            set.add(my_string.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        for(char ch : set) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}