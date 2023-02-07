class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int even[] = new int[n];
        int odd[] = new int[n];
        int a = 0, b = 0, c = 0;
        for(int i: nums){
            if((i&1) == 0) even[a++] = i;
            else odd[b++] = i;
        }
        for(int i=0;i<n;i++){
            if(i < a) nums[i] = even[i];
            else nums[i] = odd[i-a];
        }
        return nums;
    }
}
