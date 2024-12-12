class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        int i = 0;
        for(char c : t.toCharArray()) {
            if(c == s.charAt(i) && ++i == s.length()) return true;
        }
        return false;
    }
}
