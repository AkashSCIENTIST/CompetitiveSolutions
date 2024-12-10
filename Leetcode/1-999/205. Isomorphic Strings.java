class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] smap = new int[256];
        int[] tmap = new int[256];
        int n = s.length();
        
        if (n != t.length()) return false;

        for (int i = 0; i < n; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (smap[sc] != tmap[tc]) return false;

            smap[sc] = i + 1;
            tmap[tc] = i + 1;
        }

        return true;
    }
}
