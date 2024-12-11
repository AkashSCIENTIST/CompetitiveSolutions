class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n <= 2) return Math.max(nums[0], nums[n-1]);
        int[] ans = new int[n];
        ans[0] = nums[0];
        ans[1] = Math.max(nums[0], nums[1]);

        for(int i=2;i<n;i++) {
            ans[i] = Math.max(ans[i-1], ans[i-2]+nums[i]);
        }

        return ans[n-1];
    }
}
