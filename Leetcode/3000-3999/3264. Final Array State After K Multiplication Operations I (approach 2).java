class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int y=0;y<k;y++) {
            int x = 0;
            for(int i=1;i<nums.length;i++) {
                if(nums[i] < nums[x]) x = i;
            }
            nums[x] *= multiplier;
        }
        return nums;
    }
}
