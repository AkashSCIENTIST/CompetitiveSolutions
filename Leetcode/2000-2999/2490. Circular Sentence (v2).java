class Solution {
    public boolean isCircularSentence(String sentence) {
        int n = sentence.length();
        if(sentence.charAt(0) != sentence.charAt(n-1)) return false;
        int k = sentence.indexOf(" ");

        while(k != -1) {
            if(sentence.charAt(k-1) != sentence.charAt(k+1)) return false;
            k = sentence.indexOf(" ", k+1);
        }

        return true;
    }
}
