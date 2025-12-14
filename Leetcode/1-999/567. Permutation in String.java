class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int k = s1.length();
        int i = 0;
        int j = 0;

        
        for(char c : s1.toCharArray()) count1[c-'a']++;
        while(i < k) count2[s2.charAt(i++)-'a']++;

        if(Arrays.equals(count1, count2)) return true;
        for (i = k; i < s2.length(); i++) {
            count2[s2.charAt(i)-'a']++;
            count2[s2.charAt(i-k)-'a']--;
            if(Arrays.equals(count1, count2)) return true;
        }

        return false;
    }
}
