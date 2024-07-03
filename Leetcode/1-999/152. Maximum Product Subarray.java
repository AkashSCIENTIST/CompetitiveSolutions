class Solution {
    public int maxProduct(int[] nums) {
        int value = nums[0];
        int n = nums.length;
        for(int i=1, tmin=value, tmax=value; i<n; i++){
            if(nums[i]<0){
                int temp = tmax;
                tmax = tmin;
                tmin = temp;
            }
            tmin = Math.min(nums[i], tmin*nums[i]);
            tmax = Math.max(nums[i], tmax*nums[i]);
            value = Math.max(value, tmax);
            System.out.println(value);
        }
        return value;
    }
}
