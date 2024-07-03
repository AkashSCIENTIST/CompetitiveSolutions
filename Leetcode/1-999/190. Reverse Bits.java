public class Solution {
    public int reverseBits(int n) {
        int res = 0, bit;
        for(int i=0;i<32;i++){
            bit = (n >> i) & 1;
            res += bit << (31 - i);
        }
        return res;
    }
}
