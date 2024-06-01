class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0, right = 1;
        int max = 0;

        while(right < n){
            if(prices[left] < prices[right]){
                max = Math.max(max, prices[right]-prices[left]);
            }
            else{
                left = right;
            }
            right++;
        }
        
        return max;
    }
}
