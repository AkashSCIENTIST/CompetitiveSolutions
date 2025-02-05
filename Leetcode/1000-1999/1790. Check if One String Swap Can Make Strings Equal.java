class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int n = s1.length();
        if(n != s2.length()) return false;
        int mismatch = 0;
        int ind1 = -1, ind2 = -1;

        for(int i=0;i<n;i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                mismatch++;
                if(ind1 == -1 && ind2 == -1) ind1 = i;
                else if(ind1 != -1 && ind2 ==- 1) ind2 = i;
            }
        }

        // System.out.println(ind1 + " " + ind2);

        if((mismatch&1) == 1) return false;
        if(mismatch > 2) return false;
        if(
            (s1.charAt(ind2) == s2.charAt(ind1)) &&
            s1.charAt(ind1) == s2.charAt(ind2)
        ) return true;
        return false;
    }
} 
