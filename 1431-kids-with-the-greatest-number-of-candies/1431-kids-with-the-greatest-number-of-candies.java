class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // boolean resul[]= new boolean[candies.length];
        // ArrayList<Boolean> result = new  ArrayList<Boolean>(Arrays.asList(resul));
        Boolean[] resul = new Boolean[candies.length];
       
     for(int i=0;i<candies.length;i++){
         resul[i]=check((candies[i]+extraCandies),candies ,i);
     }
         ArrayList<Boolean> result = new ArrayList<Boolean>(Arrays.asList(resul));
        return result;
    }
        public boolean check(int c, int candies[],int k){
            int j=0;
            for(int i=0;i<candies.length;i++){
                if(c>=candies[i] ){
                    j++;
                }}
                if(j==candies.length){
                    return true;
                }
                else{
                    return false;
                }
            }
        
    }
