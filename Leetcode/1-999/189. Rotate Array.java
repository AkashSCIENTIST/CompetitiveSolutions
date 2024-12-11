class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>n) k %= n;
        int[] nums2 = new int[n];

        for(int i=0;i<n;i++) nums2[(i+k)%n] = nums[i];
        for(int i=0;i<n;i++) nums[i] = nums2[i];
    }
}
