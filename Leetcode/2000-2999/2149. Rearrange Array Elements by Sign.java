class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums;
        int pptr = 0, nptr = 1;
        int temp[] = new int[n];

        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                temp[pptr] = nums[i];
                pptr += 2;
            }
            else {
                temp[nptr] = nums[i];
                nptr += 2;
            }
        }

        return temp;
    }
}
