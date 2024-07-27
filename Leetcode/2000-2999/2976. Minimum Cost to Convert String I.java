class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long dist[][] = new long[26][26];
        long max_val = Long.MAX_VALUE;

        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                dist[i][j] = max_val;
            }
        }

        for(int i=0;i<cost.length;i++){
            int u = original[i] - 'a';
            int v = changed[i] - 'a';
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }

        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                if(dist[i][k] < max_val) {
                    for(int j=0;j<26;j++)
                        if(dist[k][j] < max_val)
                            dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        long ans = 0;
        for(int i=0;i<source.length();i++){
            if(source.charAt(i) == target.charAt(i)) continue;
            int u = source.charAt(i) - 'a';
            int v = target.charAt(i) - 'a';
            if(dist[u][v] == max_val) return -1;
            ans += dist[u][v];
        }

        return ans;
    }
}
