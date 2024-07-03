class Solution {
    public static int max(int a, int b){
        return a>b ? a : b;
    }
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        int ans = 1;
        int temp = 1;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]) continue;
            if((nums[i] == nums[i-1]+1)) temp++;
            else temp = 1;
            ans = max(ans, temp);
            // System.out.println(nums[i] + " " + temp + " " + ans);
                
        }
        return ans;
    }
}
