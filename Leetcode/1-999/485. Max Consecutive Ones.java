class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0) return 0;
        int count = nums[0];
        int maxCount = count;
        for(int i=1;i<nums.length;i++){
            // System.out.println(nums[i] + " " + count);
            if((nums[i-1] & nums[i]) == 1) count++;
            else{
                maxCount = Math.max(count, maxCount);
                count = nums[i];
            }
        }
        maxCount = Math.max(count, maxCount);
        return maxCount;
    }
}
