class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            while((nums[i]>0) && (nums[i]<n) && (nums[nums[i]-1] != nums[i])) {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }

        int i=0;
        for(;i<n;i++) {
            if(nums[i] != i+1) break;
        }
        return i+1;
    }
}
