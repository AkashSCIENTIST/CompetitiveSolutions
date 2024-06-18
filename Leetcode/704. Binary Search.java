class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int right = n-1, left = 0;
        int mid;

        while(left <= right){
            mid = (left+right)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) right = mid-1;
            if(nums[mid] < target) left = mid+1;
        }

        return -1;
    }
}
