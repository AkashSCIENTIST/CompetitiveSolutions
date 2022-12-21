class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int graph[][] = new int[n+1][n+1];
        int colors[] = new int[n+1];
        Arrays.fill(colors, -1);
        for(int arr[] : dislikes){
            graph[arr[0]][arr[1]] = 1;
            graph[arr[1]][arr[0]] = 1;
        }

        for(int i=0;i<=n;i++){
            if(colors[i]==-1 && !isValid(graph, colors, 0, i, n)) return false;
        }
        return true;
    }
    public boolean isValid(int graph[][], int colors[], int color, int vrtx, int n){
        if(colors[vrtx] != -1) return colors[vrtx] == color;
        colors[vrtx] = color;
        for(int i=1;i<=n;i++){
            if(graph[vrtx][i] == 1 && !isValid(graph, colors, 1-color,i, n)) return false;
        }
        return true;
    }
}
