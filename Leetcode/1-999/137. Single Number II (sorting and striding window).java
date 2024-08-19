class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a, b, c;
        int i=0;

        for(;i<n-2;i+=3) {
            a = nums[i];
            b = nums[i+1];
            c = nums[i+2];

            if((a==b) && (b==c)) continue;
            else if((a==b) && (b!=c)) return c;
            else if((a!=b) && (b==c)) return a;
        }

        return nums[n-1];
    }
}
