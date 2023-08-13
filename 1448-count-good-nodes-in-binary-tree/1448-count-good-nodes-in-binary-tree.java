// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int goodNodes(TreeNode root) {
//          if(root==null)
//         {
//             return 0;
//         }
//         int count=0;
//         solve(root,count,root->val);
//         return count;
//     }

//    public static int solve(TreeNode root , int count , int maxi)
//     {
//         if(root==null)
//         {
//             return;
//         }
//         if(root->val>=maxi)
//         {
//             count++;
//             maxi=root->val;
//         }
//         solve(root->left,count,maxi);
//         solve(root->right,count,maxi);
//     }
  
// }
class Solution {
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] count = {0}; // Using an array to pass count by reference
        solve(root, count, root.val);
        return count[0];
    }

    public static void solve(TreeNode root, int[] count, int maxi) {
        if (root == null) {
            return;
        }
        if (root.val >= maxi) {
            count[0]++;
            maxi = root.val;
        }
        solve(root.left, count, maxi);
        solve(root.right, count, maxi);
    }
}
