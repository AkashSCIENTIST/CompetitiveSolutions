class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;

        while(l <= r){
            if(nums[l] <= nums[r]) return nums[l];
            int mid = (l+r)/2;
            if(nums[l] <= nums[mid]) l = mid+1;
            else r = mid;
        }

        return 0;
    }
}
