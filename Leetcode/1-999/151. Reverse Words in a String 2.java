class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        reverse(str, 0, str.length - 1);
        reverseWords(str);
        return cleanSpaces(str);
    }

    public void reverse(char[] s, int start, int end) {
        while(start < end) {
            char c = s[start];
            s[start] = s[end];
            s[end] = c;
            start++;
            end--;
        }
    }

    public void reverseWords(char[] s) {
        int n = s.length;
        int start = 0;
        for (int end = 0; end < n; end++) {
            // Find the end of the current word
            if (s[end] == ' ') {
                reverse(s, start, end - 1);
                start = end + 1; // Move to the start of the next word
            }
        }
        // Reverse the last word
        reverse(s, start, n - 1);
    }

    public String cleanSpaces(char[] str) {
        int n = str.length;
        int i = 0, j = 0;

        while (j < n) {
            // Skip spaces
            while (j < n && str[j] == ' ') j++;
            // Copy non-space characters
            while (j < n && str[j] != ' ') str[i++] = str[j++];
            // Skip spaces to reach the next word, add only one space if there's a next word
            while (j < n && str[j] == ' ') j++;
            if (j < n) str[i++] = ' ';
        }

        return new String(str, 0, i);
    }
}
