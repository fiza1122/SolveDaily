class Solution {
    public int[] countBits(int num) {
    int[] f = new int[num + 1];
    for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
    return f;
}
//     public int[] countBits(int n) {
//         int ans[] = new int[n + 1];

//         for (int i = 0; i <= n; i++) {
//             ans[i] = countOnes(i);
//         }

//         return ans;
//     }

//     private int countOnes(int num) {
//         int count = 0;
//         while (num > 0) {
//             if (num % 2 == 1) {
//                 count++;
//             }
//             num = num / 2;
//         }
//         return count;
//     }
}
