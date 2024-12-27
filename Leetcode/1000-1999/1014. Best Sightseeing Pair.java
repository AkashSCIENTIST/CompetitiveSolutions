class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = 0, ans = 0;
        for(int i=0;i<values.length;i++) {
            ans = Math.max(ans, max + values[i] - i);
            max = Math.max(max, values[i] + i);
        }
        return ans;
    }
}
