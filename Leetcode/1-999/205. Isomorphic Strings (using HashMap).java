class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmt = new HashMap<>();

        //last case passes only when Integer is used instead of int
        for(Integer i=0;i<s.length();i++) {
            // hashmap.put() return old value when new value is in put()
            if(hms.put(s.charAt(i),i) != hmt.put(t.charAt(i),i)) 
            return false;
        }

        return true;
    }
}
