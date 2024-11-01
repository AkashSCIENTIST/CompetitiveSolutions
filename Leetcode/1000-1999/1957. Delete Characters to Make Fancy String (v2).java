class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(sb.length() < 2) sb.append(c);
            else{
                int n = sb.length();
                if(sb.charAt(n-1)==c && sb.charAt(n-2)==c) continue;
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
