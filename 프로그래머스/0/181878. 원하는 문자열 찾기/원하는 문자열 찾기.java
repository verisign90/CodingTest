class Solution {
    public int solution(String myString, String pat) {
//         String str = myString.toLowerCase();
//         String p = pat.toLowerCase();
        
//         if(myString.length() < pat.length()) {
//             return 0;
//         } else {
//             if(str.contains(p)) {
//                 return 1;
//             }
//             return 0;
//         }
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        return myString.contains(pat) ? 1 : 0;
    }
}