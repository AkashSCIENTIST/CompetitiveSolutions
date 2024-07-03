class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int localMax = 0;

        for(int num : nums){
            ans += Math.max(0, localMax-num);
            localMax = Math.max(localMax, num)+1;
        }

        return ans;
    }
}
