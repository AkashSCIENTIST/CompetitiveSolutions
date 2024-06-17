class Solution {
    public int arraySign(int[] nums) {
        int i = 1;
        for(int num : nums){
            if(num == 0) return 0;
            if(num < 0) i *= -1;
        }
        return i;
    }
}
