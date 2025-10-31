class Solution {
    public long removeZeros(long n) {
        long mul = 1;
        long ans = 0;
        long temp;
        while(n > 0) {
            temp = n%10;
            n /= 10;
            if(temp != 0) {
                ans += mul * temp;
                mul *= 10;
            }
        }
        return ans;
    }
}
