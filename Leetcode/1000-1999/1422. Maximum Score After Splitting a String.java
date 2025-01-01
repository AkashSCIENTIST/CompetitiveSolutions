class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int zeros[] = new int[n];
        int ones[] = new int[n]; 

        if(s.charAt(0) == '0') zeros[0] = 1;
        if(s.charAt(n-1) == '1') ones[n-1] = 1;

        for(int i=1;i<n;i++) {
            if(s.charAt(i) == '0') zeros[i] = zeros[i-1]+1;
            else zeros[i] = zeros[i-1];
        }

        for(int i=n-2;i>=0;i--) {
            if(s.charAt(i) == '1') ones[i] = ones[i+1]+1;
            else ones[i] = ones[i+1];
        }

        // System.out.println(Arrays.toString(zeros));
        // System.out.println(Arrays.toString(ones));

        int ans = 0;
        if(n == 2) {
            ans = zeros[0] + ones[1];
        }
        else {
            for(int i=1;i<n-1;i++) {
                ans = Math.max(ans, zeros[i]+ones[i]);
            }
        }
        return ans;
    }
}
