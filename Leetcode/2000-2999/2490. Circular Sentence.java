class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] strs = sentence.split("\\s+");
        int n = strs.length;

        for(int i=1;i<n;i++) {
            // System.out.println(strs[i-1].charAt(strs[i-1].length()-1) + " " + strs[i].charAt(0));
            if(strs[i-1].charAt(strs[i-1].length()-1) != strs[i].charAt(0))
                return false;
        }

        // System.out.println(strs[0].charAt(0) + " " + strs[n-1].charAt(strs[n-1].length()-1));
        if(strs[0].charAt(0) != strs[n-1].charAt(strs[n-1].length()-1))
            return false;

        return true;
    }
}
