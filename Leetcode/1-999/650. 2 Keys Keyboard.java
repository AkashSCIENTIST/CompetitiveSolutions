class Solution {
    public int minSteps(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i=2;i<=n;i++) {
            dp[i] = i;

            for(int j=i/2;j>=0;j--) {
                if(i%j == 0) {
                    dp[i] = dp[j] + i/j;
                    break;
                }
            }
        }

        return dp[n];
    }
}
