class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int n = grid[0].length;
        // Iterate on all rows of the matrix one by one.
        for (int[] row : grid) {
            // Using binary search find the index
            // which has the first negative element.
            int left = 0, right = n - 1;
            while (left <= right) {
                int mid = (right + left) / 2;
                if (row[mid] < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;  
                }
            }
            // 'left' points to the first negative element,
            // which means 'n - left' is the number of all negative elements.
            count += (n - left);
        }
        return count;
    }
}
//         int c=0;
//         int m= grid[0].length;
//         int n= grid.length;
 
// //         for(int i=0;i<m;i++){
            
// //             int left =0;int right = n-1;
            
// //             int mid= (left+right)/2;
            
// //             while(left<=right){
                
// //                 if(grid[i][mid]>0){
                    
// //                     left= mid+1;
// //                 }
// //                 else if(grid[i][mid]<0){
                    
// //                     if(grid[left][i]<0){
// //                         c++;
// //                     }
// //                     else{
// //                         left=mid+1;  
// //                     }
// //                 }
// //             }
// //         }
// //         return c;
// //     }
// // }