import java.math.*;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int total[] = new int[n+1];
        total[n] = 0;
        total[n-1] = cost[n-1];
        // System.out.println(Arrays.toString(total));
        for(int i=n-2;i>=0;i--){
            total[i] = cost[i] + Integer.min(total[i+1], total[i+2]);
            // System.out.println(Arrays.toString(total));
        }
        return Integer.min(total[0], total[1]);
    }
}

/*

import java.math.*;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int total[] = new int[n+1];
        total[0] = 0;
        total[1] = 0;
        
        // System.out.println(Arrays.toString(total));
        for(int i=2;i<n+1;i++){
            total[i] = Integer.min(total[i-1]+cost[i-1], total[i-2]+cost[i-2]);
            // System.out.println(Arrays.toString(total));
        }
        // System.out.println(Arrays.toString(total));

        return total[n];
    }
}

*/
