class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, min = prices[0];
        for(int curr : prices){
            min = Math.min(min, curr);
            max = Math.max(max, curr - min);
        }
        return max;
    }
}
