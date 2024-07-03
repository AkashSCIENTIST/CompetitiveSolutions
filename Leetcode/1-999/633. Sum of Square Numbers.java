class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (int) Math.sqrt(c);
        long sum;

        while(l <= r) {
            sum = l*l + r*r;
            if(sum == c) return true;
            if(sum < c) l++;
            else r--;
        }

        return false;
    }
}
