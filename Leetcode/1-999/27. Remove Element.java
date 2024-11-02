class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        if(n == 0) return 0;
        int lptr = 0, rptr = n-1;

        while(lptr < rptr) {
            while(rptr>lptr && nums[rptr] == val) rptr--;
            if(nums[lptr] == val) {
                int temp = nums[lptr];
                nums[lptr] = nums[rptr];
                nums[rptr] = temp;
            }
            else lptr++;
        }

        int count = 0;
        while(count<n && nums[count] != val) count++;
        return count;
    }
}
