class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 1) return true;
        int n = nums.length;
        boolean isInc = true, isDec = true;

        for(int i=1;i<n;i++){
            isInc &= nums[i]>=nums[i-1];
            isDec &= nums[i]<=nums[i-1];
        }

        return isInc||isDec;
    }
}
