class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int res = 0;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        Set<Character> seenPrefix = new HashSet<>();
        Set<Character> seenSuffix = new HashSet<>();

        for(int i=0;i<n;i++){
            seenPrefix.add(s.charAt(i));
            seenSuffix.add(s.charAt(n-1-i));
            prefix[i] = seenPrefix.size();
            suffix[n-1-i] = seenSuffix.size();
        }

        for(int i=0;i+1<n;i++) if(prefix[i]==suffix[i+1]) res++;
        return res;
    }
}
