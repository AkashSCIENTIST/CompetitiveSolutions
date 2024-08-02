class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i : nums) k += i;

        int count_ones = 0;
        for(int i=0;i<k;i++) count_ones += nums[i];

        int maxOnes = count_ones;
        for(int i=k;i<n+k;i++){
            count_ones += nums[i%n] - nums[(i-k+n)%n];
            maxOnes = Math.max(maxOnes, count_ones);
        }

        return k-maxOnes; //numZeros;
    }
}
