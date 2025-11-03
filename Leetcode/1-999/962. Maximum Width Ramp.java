class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<n;i++) {
            if(stk.isEmpty() || (nums[i] < nums[stk.peek()])) stk.push(i);
        }

        int maxWidth = 0;

        for(int j=n-1;j>=0;j--) {
            while(!stk.isEmpty() && (nums[stk.peek()] <= nums[j])) {
                maxWidth = Math.max(maxWidth, j - stk.pop());

            }
        }

        return maxWidth;
    }
}
