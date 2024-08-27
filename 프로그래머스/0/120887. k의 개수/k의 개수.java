class Solution {
    public int solution(int i, int j, int k) {
//         int count = 0;
//         String kk = String.valueOf(k);
        
//         for(int a=i; a<=j; a++) {
//             String aa = String.valueOf(a);
//             for(int b=0; b<aa.length(); b++) {
//                 if(aa.charAt(b) == kk.charAt(0)) {
//                     count++;
//                 }
//             }
//         }
        
//         return count;
        
        StringBuilder sb = new StringBuilder();
        for(int a=i; a<=j; a++) {
            sb.append(a);
        }
        
        String sbStr = sb.toString();
        return sbStr.length() - sbStr.replace(k+"", "").length();
    }
}