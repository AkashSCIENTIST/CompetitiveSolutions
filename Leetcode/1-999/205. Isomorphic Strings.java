class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] smap = new int[256];
        int[] tmap = new int[256];
        int n = s.length();
        if(n != t.length()) return false;

        for(int i=0;i<n;i++){
            if(smap[s.charAt(i)] != tmap[t.charAt(i)]) return false;
            smap[s.charAt(i)] += 1;
            tmap[t.charAt(i)] += 1;
        }

        return true;
    }
}
