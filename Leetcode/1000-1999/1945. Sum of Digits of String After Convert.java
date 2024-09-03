class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;

        for(char c : s.toCharArray()) {
            int val = c - 'a' + 1;
            sum += val/10;
            sum += val%10;
        }

        k--;

        for(int i=0;i<k;i++) {
            int temp = 0;
            while(sum > 0) {
                temp += sum%10;
                sum /= 10;
            }
            sum = temp;
            if(sum <= 9) break;
        }

        return sum;
    }
}
