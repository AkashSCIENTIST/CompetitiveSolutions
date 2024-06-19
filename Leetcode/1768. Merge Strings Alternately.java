class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        int i=0, j=0;
        StringBuilder sb = new StringBuilder();

        while(i<n1 && j<n2){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        while(i<n1){
            sb.append(word1.charAt(i++));
        }

        while(j<n2){
            sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }
}
