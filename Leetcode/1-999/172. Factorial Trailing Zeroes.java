class Solution {
    public int trailingZeroes(int n) {
        if(n <= 4) return 0;
        int ans = 0;
        while(n > 0) {
            ans += (n/5);
            n /= 5;
        }
        return ans;
    }
}
