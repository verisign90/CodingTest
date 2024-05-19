class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        
//        for(int i=0; i<my_string.length(); i++) {
//             char c = my_string.charAt(i);
//             for(int j=0; j<n; j++) {
//                 sb.append(c);
//             }
//         }
        
//         return sb.toString();
        
//         String[] arr = my_string.split("");
        
//         for(int i=0; i<arr.length; i++) {
//             sb.append(arr[i].repeat(n));
//         }
        
//         return sb.toString();
        
        for(char c : my_string.toCharArray()) {
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}