class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 1;
        int i=1;
        int num = nums[0];
        int count = 1;
        int n = nums.length;

        for(;ptr<n;ptr++) {
            if(num == nums[ptr]) {
                if(count >= 2) continue;
                else {
                    nums[i++] = nums[ptr];
                    count++;
                }
            }
            else {
                nums[i++] = nums[ptr];
                num = nums[ptr];
                count = 1;
            }
        }

        return i;
    }
}
