class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();
        if(s.length() < p.length()) return res;

        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int k = p.length();
        int i = 0;
        int j = 0;

        for(char c : p.toCharArray()) count1[c-'a']++;
        while(i < k) count2[s.charAt(i++)-'a']++;

        if(Arrays.equals(count1, count2)) res.add(j);
        while(j < s.length()-k) {
            count2[s.charAt(i++)-'a']++;
            count2[s.charAt(j++)-'a']--;
            if(Arrays.equals(count1, count2)) res.add(j);
        }

        return res;
    }
}
