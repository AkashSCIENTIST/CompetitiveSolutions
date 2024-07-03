class Solution {
    public int minDifference(int[] nums) {
        if(nums.length < 5) return 0;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i=0;i<=3;i++) ans = Math.min(ans, nums[nums.length-4+i]-nums[i]);
        return ans;
    }
}
