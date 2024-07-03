class Solution {
    public int findDuplicate(int[] nums) {
        int fast = 0, slow = 0, slow2 = 0;

        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(nums[fast] != nums[slow]);

        while(nums[slow] != nums[slow2]){
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return nums[slow];
    }
}
