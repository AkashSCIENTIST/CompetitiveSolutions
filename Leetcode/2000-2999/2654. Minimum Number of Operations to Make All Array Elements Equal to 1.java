class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ones = 0;
        int g;

        for(int i=0;i<n;i++) if(nums[i] == 1) ones++;
        if(ones > 0) return n - ones;

        int ops = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            g = nums[i];
            for(int j=i+1;j<n;j++) {
                g = gcd(g, nums[j]);
                if(g == 1) {
                    ops = Math.min(ops, j - i);
                    break;
                }
            }
        }

        return (ops == Integer.MAX_VALUE) ? -1 : ops + n - 1;
    }

    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
