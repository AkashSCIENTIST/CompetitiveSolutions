class Solution {
    public int jump(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int currEnd = 0;
        int currFarthest = 0;
        
        for(int i = 0;i<n-1;i++){
            currFarthest = Math.max(currFarthest, i+ nums[i]);
            if(i==currEnd){
                ans++;
                currEnd = currFarthest;
            }
        }
        return ans;
    }
}
