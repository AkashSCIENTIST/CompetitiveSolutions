class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int ans = -1;
        char prev = '@';
        int[][] counts = new int[26][n+1];
        int runLength = 0;

        for(char c : s.toCharArray()) {
            if(prev == c) {
                (counts[c - 'a'][++runLength])++;
            }
            else {
                runLength = 1;
                (counts[c - 'a'][runLength])++;
                prev = c;
            }
        }

        for(int[] count : counts) {
            ans = Math.max(ans, findFreq(count, n));
        }

        return ans;
    }

    int findFreq(int[] count, int n) {
        int times = 0;
        for(int freq=n;freq>=1;--freq) {
            times += count[freq];
            if(times >= 3) return freq;
        }
        return -1;
    }
}
