class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length-1;
        boolean[] found = new boolean[n];
        for(int i : nums){
            if(found[i-1]) return i;
            found[i-1] = true;
        }
        return -1;
    }
}
