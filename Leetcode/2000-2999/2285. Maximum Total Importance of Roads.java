class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long count[] = new long[n];
        for(int[] road : roads) {
            count[road[0]]++;
            count[road[1]]++;
        }
        Arrays.sort(count);
        long ans = 0;
        for(int i=0;i<n;i++) ans += (i+1)*count[i];
        return ans;
    }
}
