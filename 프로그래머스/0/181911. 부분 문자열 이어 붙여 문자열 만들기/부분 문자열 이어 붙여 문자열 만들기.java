class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<parts.length; i++) {
            int[] range = parts[i];
            int start = range[0];
            int end = range[1];
            
            sb.append(my_strings[i].substring(start, end + 1));
        }
        
        return sb.toString();
    }
}