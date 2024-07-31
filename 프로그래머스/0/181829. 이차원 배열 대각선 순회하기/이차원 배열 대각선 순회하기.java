class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        for(int i=0; i<board.length; i++) { //4
            for(int j=0; j<board[i].length; j++) {  //3 2까지만
                if(i + j <= k) {
                    sum += board[i][j];
                }
            }
        }
        return sum;
    }
}