class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE+1;
        int rolling_sum = 0;
        int n = nums.length;

        for(int i=0;i<k;i++) rolling_sum += nums[i];
        maxSum = Math.max(rolling_sum, maxSum);
        // System.out.println(maxSum);

        for(int prev=0, i=k; i<n; prev++, i++) {
            rolling_sum -= nums[prev];
            rolling_sum += nums[i];
            maxSum = Math.max(rolling_sum, maxSum);
            // System.out.println(maxSum);
        }

        return (double)maxSum / k;
    }
}
