class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int count[][] = new int[m+1][n+1];

        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                if(text1.charAt(i) == text2.charAt(j)) {
                    count[i][j] = 1 + count[i+1][j+1];
                }
                else {
                    count[i][j] = Math.max(count[i+1][j], count[i][j+1]);
                }
            }
        }

        // System.out.println(Arrays.deepToString(count));
        return count[0][0];
    }
}
