import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morseDic = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
//         char alphabet = 'a';
//         Map<String, Character> morseMap = new HashMap<>();
//         for(String morse : morseDic) {
//             morseMap.put(morse, alphabet++);
//         }
        
//         StringBuilder sb = new StringBuilder();
//         String[] morseArr = letter.split(" ");
//         for(String m : morseArr) {
//             sb.append(morseMap.get(m));
//         }
//         return sb.toString();
        
        StringBuilder sb = new StringBuilder();
        String[] morseLetter = letter.split(" ");
        for(String word : morseLetter) {
            for(int i=0; i<morseDic.length; i++) {
                if(word.equals(morseDic[i])) {
                    sb.append((char)(i + 'a'));
                }
            }
        }
        return sb.toString();
    }
}