class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];
        int maxSoFar = nums[0];
        for(int j=1;j<nums.length;j++){
            curSum = curSum + nums[j];
            if(curSum < nums[j]) curSum = nums[j];
            if(maxSoFar < curSum) maxSoFar = curSum;
        }
        return maxSoFar;
    }
}
