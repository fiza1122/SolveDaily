class Solution {
    public boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);
        if( (int)n*n == num){
            return true;
        }
        else {
            return false;
        }
    }
}