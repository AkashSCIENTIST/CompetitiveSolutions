class Solution {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String S = ""+n;
        int K = S.length();
        int dp[] = new int[K+1];
        dp[K] = 1;

        for(int i=K-1;i>=0;i--){
            int temp = S.charAt(i) - '0';
            for(String digit : digits){
                int dval = Integer.valueOf(digit);
                if(dval == temp) dp[i] += dp[i+1];
                else if(dval < temp) dp[i] += Math.pow(digits.length, K-i-1);
            }
        }
        // System.out.println(Arrays.toString(dp));

        for(int i=1;i<K;i++) dp[0] += Math.pow(digits.length, i);
        return dp[0];
    }
}
