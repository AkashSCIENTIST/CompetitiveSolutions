class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int l=0, r=0, fur=0;
        
        while(r < n-1){
            fur = 0;
            for(int i=l;i<=r;i++){
                fur = Math.max(fur, i+nums[i]);
            }
            l = r+1;
            r = fur;
            jumps++;
        }

        return jumps;
    }
}
