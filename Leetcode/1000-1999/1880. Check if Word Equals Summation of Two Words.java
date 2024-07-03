class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int value1 = 0;
        for(char i : firstWord.toCharArray()){
            value1 *= 10;
            value1 += (i - 'a');
        }
        int value2 = 0;
        for(char i : secondWord.toCharArray()){
            value2 *= 10;
            value2 += (i - 'a');
        }
        int value3 = 0;
        for(char i : targetWord.toCharArray()){
            value3 *= 10;
            value3 += (i - 'a');
        }
        return (value1+value2) == value3;
    }
}
