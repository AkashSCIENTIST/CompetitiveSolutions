class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        else{
            int m = grid.length;
            int n = grid[0].length;
            int count = 0;
            int countArray[] = {0};
            for(int i=0;i<m;i++){
                for(int j = 0; j<n;j++){
                    if(grid[i][j] == 0) continue;
                    dfs(grid, m, n, i, j, countArray);
                    count = Math.max(count, countArray[0]);
                    countArray[0] = 0;
                }
            }
            return count;
        }
    }

    private void dfs(int[][] grid, int m, int n, int i, int j, int[] countArray){
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != 1) return;
        else{
            grid[i][j] = 0;
            countArray[0]+=1;
            dfs(grid, m, n, i-1, j, countArray);
            dfs(grid, m, n, i+1, j, countArray);
            dfs(grid, m, n, i, j-1, countArray);
            dfs(grid, m, n, i, j+1, countArray);
        }
    }
}
