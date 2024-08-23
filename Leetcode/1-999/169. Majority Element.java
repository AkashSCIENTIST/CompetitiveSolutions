class Solution {
    public int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;

        for(int i : nums) {
            if(count == 0) {
                count++;
                element = i;
            }
            else if(i == element) count++;
            else count--;
        }

        return element;
    }
}
