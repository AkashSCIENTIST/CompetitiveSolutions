class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int b[] = new int[n];
        for(int i=0;i<n;i++) b[i] = heights[i];
        Arrays.sort(b);
        int count = 0;
        for(int i=0;i<n;i++) if(heights[i]!=b[i]) count++;
        return count;
    }
}
