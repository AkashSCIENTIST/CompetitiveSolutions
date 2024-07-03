class Solution {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        int mid = -1;
        while(l<=r){
            if(nums[l] == target) return l;
            if(nums[r] == target) return r;
            mid = (l+r)/2;
            if(nums[mid] == target) return mid;
            //left sorted
            if(nums[l]<=nums[mid]){
                if(target > nums[mid] || target < nums[l]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }else{//right sorted
                if(target < nums[mid] || target > nums [r]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
        }

        return -1;
    }
}
