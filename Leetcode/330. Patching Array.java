class Solution {
    public int minPatches(int[] nums, int n) {
        int cost = 0, i = 0;
        long upper = 1;

        while(upper <= n){
            if(i<nums.length && nums[i]<=upper){
                upper += nums[i];
                i++;
            }
            else{
                cost++;
                upper += upper;
            }
        }

        return cost;
    }
}
