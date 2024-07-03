class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n-1] += 1;
        for(int i=n-1;i>0;i--){
            if(digits[i] == 10){
                digits[i] = 0;
                digits[i-1] += 1;
            }
        }
        if(digits[0] < 10) return digits;
        else{
            int digitss[] = new int[n+1];
            digitss[0] = 1;
            for(int i=1;i<=n;i++){
                digitss[i] = digits[i-1];
            }
            digitss[1] = 0;
            return digitss;
        }
    }
}
