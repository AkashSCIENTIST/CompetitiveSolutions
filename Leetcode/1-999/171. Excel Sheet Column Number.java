class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        for(char c : columnTitle.toCharArray()){
            num = num * 26 + c - 'A' + 1;
        }
        return num;
    }
}
