public class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        int len = String.valueOf(n).length();
        
        for (int i = 0; i < len; i++) {
            int divider = (int) Math.pow(10, i);
            int higherDigits = n / (divider * 10);
            int currentDigit = (n / divider) % 10;
            int lowerDigits = n % divider;
            
            if (currentDigit > 1) {
                count += (higherDigits + 1) * divider;
            } else if (currentDigit == 1) {
                count += (higherDigits * divider) + (lowerDigits + 1);
            } else {
                count += higherDigits * divider;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 13;
        int result = solution.countDigitOne(n);
        System.out.println("Output for n = " + n + ": " + result); // Output: 6
    }
}
// class Solution {
//     public int countDigitOne(int n) {
//         int count=0;
//         for(int i=0;i<=n;i++){
//             count =count+solve(i);
//         }
//         return count;
        
//         // if(n<0){
//         // return c;   
//         // }
//         // else{
//         //       int num=n;
//         // while(num>0){
//         //     d=num%10;
//         //     if(d==1){
//         //         c++;
//         //     }
//         //     num=num/10;
//         // }
//         //     return countDigitOne(n-1);
//         // }}}


// //          if(n<0){
// //              return c; }
// //         else {
// //             s=Integer.toString(n);
// //             if(s.startsWith("1") || s.endsWith("1")){
// //                 c++;}
// //            return countDigitOne(n-1);
// //         }
// //     }
// // }








//         // String s="";
//         // int c=0;
//         // for(int i=0;i<=n;i++){
//         //     s=Integer.toString(i);
//         //     for(int j=0;j<s.length();j++){
//         //          if(s.charAt(j)=='1'){
//         //              c++;
//         //          }         }
//         // }
//         // return c;
// //     }
// // }