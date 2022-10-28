class Solution {
    public boolean canJump(int[] nums) {
        int n  = nums.length - 1;
        for(int i=n-1;i>=0;i--){
            if(i+nums[i] >= n) n = i;
        }
        return n == 0;
    }
}
