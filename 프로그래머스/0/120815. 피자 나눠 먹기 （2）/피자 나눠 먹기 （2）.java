class Solution {
    public int solution(int n) {
        int index = 1;
        while((6 * index) % n != 0) {
            index++;
        }
        return index;
    }
}