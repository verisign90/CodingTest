class Solution {
    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
        
//         if(is_suffix.length() <= my_string.length()) {
//             int index = my_string.length() - is_suffix.length();
//             String str = my_string.substring(index);
//             if(str.equals(is_suffix)) {
//                 return 1;
//             }
//         }
        
//         return 0;
    }
}