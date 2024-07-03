class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        boolean isEven = false;
        while(n > 0){
            if(isEven) sum += n%10;
            else sum += -1 * n%10;
            n /= 10;
            isEven ^= true;
        }
        return isEven ? -sum : sum;
    }
}
