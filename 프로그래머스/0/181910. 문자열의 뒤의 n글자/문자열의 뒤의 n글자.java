class Solution {
    public String solution(String my_string, int n) {
        // int startIndex = my_string.length() - n;
        // return my_string.substring(startIndex);
        return my_string.substring(my_string.length() - n);
    }
}