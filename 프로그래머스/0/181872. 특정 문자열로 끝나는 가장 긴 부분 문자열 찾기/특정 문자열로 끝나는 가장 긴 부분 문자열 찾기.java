class Solution {
    public String solution(String myString, String pat) {
        // for(int i=myString.length()-pat.length(); i>=0; i--) {
        //     if(myString.substring(i, i+pat.length()).equals(pat)) {
        //         return myString.substring(0, i+pat.length());
        //     }
        // }
        // return "";
        
        for(int i=myString.length()-1; i>=0; i--) {
            if(myString.substring(0, i+1).endsWith(pat)) {
                return myString.substring(0, i+1);
            }
        }
        return "";
    }
}