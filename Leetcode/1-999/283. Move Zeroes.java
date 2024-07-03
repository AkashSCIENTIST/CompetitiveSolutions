class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1 || nums.length == 0) return;
        int i = 0;

        for(int num : nums) {
            if(num != 0) nums[i++] = num;
        }

        while(i < nums.length) nums[i++] = 0;
    }
}
