class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int l = 0, r = 0;
        Arrays.sort(nums);

        for(;r<nums.length;r++) {
            if(nums[r]-nums[l] > 2*k) l++;
        }

        return r-l;
    }
}
