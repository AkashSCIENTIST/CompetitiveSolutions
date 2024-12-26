class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i: nums) sum += i;
        if((sum < target) || ((sum-target)%2 != 0)) return 0;

        int subsetSum = (sum - target) / 2;
        int dp[] = new int[subsetSum+1];
        dp[0] = 1;

        for(int num : nums) {
            for(int j=subsetSum; j>=num; j--) {
                dp[j] += dp[j-num];
            }
        }

        return dp[subsetSum];
    }
}
