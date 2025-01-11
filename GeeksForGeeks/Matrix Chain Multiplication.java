class Solution {
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int[] row : dp) Arrays.fill(row, -1);
        return fun(arr, 1, n-1, dp);
    }
    static int fun(int[] arr, int i, int j, int[][] dp) {
        if(i == j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int min = Integer.MAX_VALUE;
        
        for(int k=i;k<=j-1;k++) {
            int temp = fun(arr, i, k, dp) + fun(arr, k+1, j, dp) + arr[i-1]*arr[k]*arr[j];
            min = Math.min(temp, min);
        }
        dp[i][j] = min;
        
        return min;
    }
}
