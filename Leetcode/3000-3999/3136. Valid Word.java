class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean anyVowel = false;
        boolean anyConsonant = false;

        for(char c : word.toCharArray()) {
            if(!Character.isLetterOrDigit(c)) return false;
            if(Character.isDigit(c)) continue;
            if(
                (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') ||
                (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')
            ) anyVowel = true;
            else anyConsonant = true;
        }

        return (anyConsonant && anyVowel);
    }
}
