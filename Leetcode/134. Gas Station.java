class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tGas = 0, tCost = 0, tDelta = 0, res = 0;
        int n = gas.length;

        for(int i=0;i<n;i++){
            tGas += gas[i];
            tCost += cost[i];
        }

        if(tGas < tCost) return -1;

        for(int i=0;i<n;i++){
            tDelta += gas[i] - cost[i];
            if(tDelta < 0) {
                tDelta = 0;
                res = i+1;
            }
        }

        return res;
    }
}
