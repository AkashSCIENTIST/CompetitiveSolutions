class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        int[] count = new int[k];
        int prefix = 0;
        count[0] = 1;

        for(int i : nums){
            prefix = (prefix + k + (i%k)) % k;
            ans += count[prefix];
            count[prefix]++;
        }

        return ans;
    }
}
