class Solution {
    public String solution(String myString) {
//         StringBuilder sb = new StringBuilder();
        
//         for(int i=0; i<myString.length(); i++) {
//             char ch = myString.charAt(i);
//             if(ch == 'a') {
//                 sb.append('A');
//             } else if(ch != 'A' && Character.isUpperCase(ch)) {
//                 sb.append(Character.toLowerCase(ch));
//             } else {
//                 sb.append(ch);
//             }
//         }
        
//         return sb.toString();
        
        return myString.toLowerCase().replaceAll("a", "A");
    }
}