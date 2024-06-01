class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int n = s.length();
        for(int i=1;i<n;i++){
            score += Math.abs((int)(s.charAt(i) - s.charAt(i-1)));
        }
        return score;
    }
}
