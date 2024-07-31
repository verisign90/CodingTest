import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");        
        List<String> list = new ArrayList<>();

        for(String a : arr) {
            if(!a.isEmpty()) {
                list.add(a);    
            }
        }

        // String[] answer = list.toArray(new String[0]);
        // Arrays.sort(answer);
        // return answer;
        
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
}