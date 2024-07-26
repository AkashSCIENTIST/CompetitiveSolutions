class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int newEdges[][] = new int[n][n]; 
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                newEdges[i][j] = distanceThreshold+1;
            }
        }

        for(int[] edge : edges){
            int i = edge[0];
            int j = edge[1];
            int cost = edge[2];
            newEdges[i][j] = cost;
            newEdges[j][i] = cost;
        }

        for(int i=0;i<n;i++) newEdges[i][i] = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                for(int k=0;k<n;k++) {
                    newEdges[j][k] = Math.min(newEdges[j][k], newEdges[j][i]+newEdges[i][k]);
                }
            }
        }

        int cityId = -1;
        int gCount = n;

        for(int i=0;i<n;i++) {
            int count = 0;
            for(int j=0;j<n;j++)
                if(newEdges[i][j] <= distanceThreshold) count++;
            if(count <= gCount) {
                gCount = count;
                cityId = i;
            }
        }

        return cityId;
    }
}
