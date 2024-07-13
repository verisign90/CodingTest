class Solution {
    public int solution(String my_string, String is_suffix) {
        int begin = my_string.length() - is_suffix.length();
        if(my_string.length() < is_suffix.length()) {
            return 0;
        } else if(my_string.substring(begin).equals(is_suffix)) {
            return 1;
        }
        return 0;
    }
}