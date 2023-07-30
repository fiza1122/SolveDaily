class Solution {
      int c=0,i=0;
    public int arrangeCoins(int n) {
        i++;
             if(n>0 && n>=i ){
                 c++;
                 arrangeCoins(n-i);
             }
        
        return c;
    }
}