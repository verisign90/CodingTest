class Solution {
    public String solution(String my_string) {
//         char[] array = my_string.toCharArray();
        
//         for(int i=0; i<array.length; i++) {
//             if(Character.isUpperCase(array[i])) {
//                 array[i] = Character.toLowerCase(array[i]);
//             } else {
//                 array[i] = Character.toUpperCase(array[i]);
//             }
//         }
        
//         return new String(array);
        
//         String answer = "";
        
//         for(int i=0; i<my_string.length(); i++) {
//             if(Character.isUpperCase(my_string.charAt(i))) {
//                 answer += Character.toLowerCase(my_string.charAt(i));
//             } else {
//                 answer += Character.toUpperCase(my_string.charAt(i));
//             }
//         }
        
//         return answer;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }
        
        return sb.toString();
    }
}