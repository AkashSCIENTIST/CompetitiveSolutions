class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char ch = '\0';

        for(char c : word.toCharArray()) {
            if(ch == '\0') {
                count++;
                ch = c;
            }
            else if(ch == c) {
                count++;
                if(count == 9) {
                    sb.append(count);
                    sb.append(ch);
                    ch = '\0';
                    count = 0;
                }
            }
            else {
                sb.append(count);
                sb.append(ch);
                ch = c;
                count = 1;
            }
        }

        if(ch != '\0') {
            sb.append(count);
            sb.append(ch);
        }

        return sb.toString();
    }
}
