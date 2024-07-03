class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int n = arr.length;
        if(n == 1) return true;
        char[] chars = new char[n];
        int i = -1;

        for(char c : arr){
            if(Character.isLetter(c) || Character.isDigit(c)) chars[++i] = c;
        }
        // System.out.println(Arrays.toString(chars));
        int j = i;
        i = 0;
        while(i <= j){
            if(chars[i] != chars[j]) return false;
            i++;j--;
        }
        return true;
    }
}
