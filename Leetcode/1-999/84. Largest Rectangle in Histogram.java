class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && (heights[stk.peek()] >= heights[i]))
                stk.pop();
            if (stk.isEmpty())
                left[i] = 0;
            else
                left[i] = stk.peek()+1;
            stk.push(i);
        }

        while (!stk.isEmpty())
            stk.pop();

        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && (heights[stk.peek()] >= heights[i]))
                stk.pop();
            if (stk.isEmpty())
                right[i] = n - 1;
            else
                right[i] = stk.peek()-1;
            stk.push(i);
        }

        int value = 0;
        for (int i = 0; i < n; i++)
            value = Math.max(value, (right[i] - left[i] + 1) * heights[i]);

        return value;
    }
}
