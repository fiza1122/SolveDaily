class Solution {


    boolean func(int a){
        if(a == 2 || a == 3) return true;
        if(a == 1) return false;
        for(int i = 2 ; i <= Math.sqrt(a) ; i++) if(a%i==0) return false;
        return true;
    }
    public int[] closestPrimes(int left, int right) {

        
        List<Integer> L = new ArrayList<>();
        int[] ans = new int[]{-1,-1};
        int dif = 1000000;
        int last = -1;

        for(int i = left ; i <= right ; i++){
            if(func(i)){
               if(last == -1) {
                   last = i; 
                   continue;
               }
               else{
                   if(i - last < dif){
                       dif = i - last;
                       ans[1] = i;
                       ans[0] = last;
                       if(dif<=2) return ans;

                   }
                   last = i;
               }
            }
        }
     
       
        return ans;

        
    }
}