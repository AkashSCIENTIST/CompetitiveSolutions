class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int res = n;
        int aCountRight = 0;
        int bCountLeft = 0;

        for(int i=0;i<n;i++) if(s.charAt(i) == 'a') aCountRight++;
        for(int i=0;i<n;i++) {
            if(s.charAt(i) == 'a') aCountRight--;
            res = Math.min(res, bCountLeft + aCountRight);
            if(s.charAt(i) == 'b') bCountLeft++;
        }

        return res;
    }
}
