class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean status[] = new boolean[26];
        for(char c : allowed.toCharArray()) status[c-'a'] = true;
        int count = 0;
        for(String word : words) if(check(word, status)) count++;
        return count;
    }

    boolean check(String word, boolean[] status) {
        for(char c : word.toCharArray())
            if(status[c-'a'] == false) return false;
        return true;
    }
}
