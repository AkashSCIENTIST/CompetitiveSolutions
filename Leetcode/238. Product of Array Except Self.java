class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        boolean isZero = false;
        int zeroCount = 0;
        for(int i : nums){
            if(i == 0){isZero = true; zeroCount++;}
            else pro *= i;
        }
        int n = nums.length;
        if(zeroCount >= 2) pro = 0;
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            if(isZero){
                if(nums[i] == 0) res[i] = pro;
                else res[i] = 0;
            }
            else{
                res[i] = pro / nums[i];
            }
        }
        return res;
    }
}
