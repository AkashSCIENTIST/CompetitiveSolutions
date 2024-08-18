public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        /*
        
        let X be repeating number and Y be missing number
        S be sum of all values of array
        Sn be sum of all first n natural numbers
        
        so Sn = S + Y - X
        which becomes X - Y = S - Sn
        
        S2 be sum of all square values of array
        S2n be sum of all square values of first n natural numbers
        
        S2n = S2 + Y2 - X2
        which becomes X2 - Y2 = S2 - S2n
        
        we have X-Y and X2-Y2
        
        */
        
        long n = A.length;
        long S = 0;
        long S2 = 0;
        
        for(int i : A) {
            S += (long)i;
            S2 += (long)i * (long)i;
        }
        
        long Sn = (n*(n+1))/2;
        long S2n = (n*(n+1)*(2*n+1))/6;
        
        long xmy = S - Sn; //X-Y
        long x2my2 = S2 - S2n; //X2-Y2
        long xpy = x2my2 / xmy; //X+Y
        
        long x = (xmy + xpy) / 2;
        long y = x - xmy;
        
        return new int[]{(int)x, (int)y};
    }
}
