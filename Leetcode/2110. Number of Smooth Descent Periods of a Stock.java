class Solution {
    public long getDescentPeriods(int[] prices) {
        if(prices.length == 0 || prices.length == 1) return 1;
        long n = prices.length;
        long total = 0;
        long size = 1;

        for(int i=1;i<n;i++){
            if(prices[i-1]-prices[i] == 1) size++;
            else{
                total += (long)size * (size+1) / 2;
                size = 1;
            }
        }

        total += (long)size * (size+1) / 2;
        return total;
    }
}
