class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int res = 0;
        if(n1%2 == 1){
            for(int i:nums2) res ^= i;
        }
        if(n2%2 == 1){
            for(int i:nums1) res ^= i;
        }
        return res;
    }
}
