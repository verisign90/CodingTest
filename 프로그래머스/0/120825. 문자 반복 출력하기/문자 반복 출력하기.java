class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        // for(int i=0; i<my_string.length(); i++) {
        //     for(int j=0; j<n; j++) {
        //         sb.append(my_string.charAt(i));
        //     }
        // }
        
        for(int i=0; i<my_string.length(); i++) {
            //sb.append(String.valueOf(my_string.charAt(i)).repeat(n));
            sb.append(("" + my_string.charAt(i)).repeat(n));
        }
        
        // String[] answer = my_string.split("");
        // for(int i=0; i<answer.length; i++) {
        //     sb.append(answer[i].repeat(n));
        // }
        
        // for(char c : my_string.toCharArray()) {
        //     sb.append((c + "").repeat(n));
        // }
        return sb.toString();
    }
}