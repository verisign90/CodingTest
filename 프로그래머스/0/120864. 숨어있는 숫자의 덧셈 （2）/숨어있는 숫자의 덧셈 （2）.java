class Solution {
    public int solution(String my_string) {
        // int sum = 0;
        // String[] arr = my_string.replaceAll("[a-zA-Z]", " ").trim().split(" ");
        // for(String s : arr) {
        //     if(!s.isEmpty()) {
        //         sum += Integer.parseInt(s);
        //     }
        // }
        // return sum;
        
        int sum = 0;
        String[] arr = my_string.replaceAll("[a-zA-Z]", " ").trim().split("\\s+");
        for(String s : arr) {
            if(!s.isEmpty()) {
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }
}