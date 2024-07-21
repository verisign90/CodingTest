class Solution {
    public String solution(int age) {
        // String[] arr = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        // String a = String.valueOf(age);
        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<a.length(); i++) {
        //     sb.append(arr[a.charAt(i) - '0']);
        // }
        // return sb.toString();
        
        String nai = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<nai.length(); i++) {
            sb.append((char)(nai.charAt(i) + 49));
        }
        return sb.toString();
    }
}