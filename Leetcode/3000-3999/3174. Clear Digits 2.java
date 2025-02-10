class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++) {
            char c = s.charAt(i);
            if(Character.isAlphabetic(c)) sb.append(c);
            else if(Character.isDigit(c)) sb.setLength(Math.max(0, sb.length()-1));
        }
        return sb.toString();
    }
}
