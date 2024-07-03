class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        int count[] = new int[128];
        boolean hasOdd = false;

        for(char c : s.toCharArray()) count[c]++;
        for(int freq : count){
            ans += (freq%2 == 0) ? freq : freq-1;
            hasOdd |= (freq%2 == 1) ? true : false;
        }

        return ans + (hasOdd ? 1 : 0);
    }
}
