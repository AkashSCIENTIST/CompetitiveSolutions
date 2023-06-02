class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length,
        leftSum = 0,
        rightSum = 0;
        for(int i : nums) rightSum += i;

        for(int i=0;i<n;i++){
            rightSum -= nums[i];
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }

        return -1;
    }
}
