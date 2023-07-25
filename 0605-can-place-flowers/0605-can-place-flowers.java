// class Solution {
//     public boolean canPlaceFlowers(int[] flowerbed, int n) {
//    int en = flowerbed.length;
//           if(en==1){
//               if(flowerbed[0]==0 && n!=0){
//                  flowerbed[0]=1;
//                  n--; 
//               }}
//          else if( flowerbed[0]==0  && flowerbed[1]!=1 && n!=0){
//                  flowerbed[0]=1;
//                  n--; }
         
//         else if(flowerbed[en-1]==0  && flowerbed[en-2]!=1 && n!=0 && en!=1  && en>1){
//          flowerbed[en-1] =1;
//                 n--;}
//     else {
//         for(int i=1 ;i<en-1 ;i++){
//            if(flowerbed[i]==0  && flowerbed[i-1]!=1  && flowerbed[i+1]!=1 && (n!=0 )) 
//            {
//                 flowerbed[i]=1; n--;}}
//     }
      
//     return n<=0;
//     }
// }
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int en = flowerbed.length;
        
        // Handle the first plot separately
        if (flowerbed[0] == 0 && (en == 1 || flowerbed[1] != 1)) {
            flowerbed[0] = 1;
            n--;
        }
        
        // Loop from index 1 to en-2
        for (int i = 1; i < en - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
                flowerbed[i] = 1;
                n--;
            }
        }
        
        // Handle the last plot separately
        if (flowerbed[en - 1] == 0 && flowerbed[en - 2] != 1) {
            n--;
        }
        
        return n <= 0;
    }
}
