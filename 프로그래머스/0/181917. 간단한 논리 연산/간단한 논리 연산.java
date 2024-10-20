class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        Boolean[] arr = {x1, x2, x3, x4};
        if(arr[0]==false && arr[1]==false) {
            return false;
        } else if(arr[2]==false && arr[3]==false) {
            return false;
        } else {
            return true;
        }
    }
}