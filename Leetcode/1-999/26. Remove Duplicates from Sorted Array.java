class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 1) return n;
        int uidx = 1;

        for(int idx=1;idx<n;idx++) {
            if(nums[idx] != nums[idx-1]) {
                nums[uidx] = nums[idx];
                uidx++;
            }
        }

        return uidx;
    }
}
