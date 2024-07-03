class Solution {
    public String generateTheString(int n) {
        char[] str = new char[n];
        Arrays.fill(str, 'a');
        if(n%2==0) {
            str[0] = 'b';
        }
        return new String(str);
    }
}
