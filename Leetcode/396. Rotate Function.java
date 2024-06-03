class Solution { //581
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i : nums) sum += i;
        int max = 0;
        for(int i=0;i<n;i++) max += i*nums[i];
        int sumindex = max;
        for(int i=n-1;i>0;i--){
            int diff = sum - (n * nums[i]);
            sumindex += diff;
            max = Math.max(max, sumindex);
        }
        return max;
    }
}
