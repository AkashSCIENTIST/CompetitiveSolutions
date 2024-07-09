class Solution {
    public double averageWaitingTime(int[][] customers) {
        double time = 0, wait = 0;

        for(int[] c : customers) {
            time = Math.max(time, (double)c[0]) + c[1];
            wait += time - c[0];
        }

        return wait / customers.length;
    }
}
