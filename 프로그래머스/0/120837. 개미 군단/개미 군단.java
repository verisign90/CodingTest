class Solution {
    public int solution(int hp) {
        int a = hp / 5;         // 24 / 5 = 4 나머지 4
        int b = (hp % 5) / 3;   // 4 / 3 = 1 나머지 1
        int c = (hp % 5) % 3;
        return a + b + c;
    }
}