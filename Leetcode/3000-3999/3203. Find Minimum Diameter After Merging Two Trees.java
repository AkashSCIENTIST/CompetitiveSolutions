class Solution {
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        int d1 = getDiameter(edges1);
        int d2 = getDiameter(edges2);
        int combined = ((d1 + 1)/2) + ((d2 + 1)/2) + 1;
        return Math.max(Math.max(d1, d2), combined);
    }

    public int getDiameter(int edges[][]) {
        int n = edges.length + 1;
        List<Integer>[] graph = new List[n];

        for(int i=0;i<n;i++) graph[i] = new ArrayList<>();
        for(int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        int[] dia = new int[1];
        getDepth(graph, 0, -1, dia);
        return dia[0];
    }

    public int getDepth(List<Integer>[] graph, int u, int prev, int[] dia) {
        int maxD1 = 0;
        int maxD2 = 0;

        for(int v : graph[u]) {
            if(v == prev) continue;
            int maxD = getDepth(graph, v, u, dia);
            if(maxD > maxD1) {
                maxD2 = maxD1;
                maxD1 = maxD;
            }
            else if(maxD > maxD2) {
                maxD2 = maxD;
            }
        }

        dia[0] = Math.max(dia[0], maxD1 + maxD2);
        return 1 + maxD1;
    }
}
