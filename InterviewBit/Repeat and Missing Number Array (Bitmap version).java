public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int n = A.length;
        boolean exist[] = new boolean[n];
        int a = -1, b = -1;
        
        for(int i : A) {
            if(exist[i-1]) a = i;
            else exist[i-1] = true;
        }
        
        for(int i=0;i<n;i++) if(!exist[i]) b = i+1;
        
        return new int[]{a, b};
    }
}
