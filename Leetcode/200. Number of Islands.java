class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        else{
            int m = grid.length;
            int n = grid[0].length;
            int count = 0;
            for(int i=0;i<m;i++){
                for(int j = 0; j<n;j++){
                    if(grid[i][j] != '1') continue;
                    count++;
                    dfs(grid, m, n, i, j);
                }
            }
            return count;
        }
    }
    
    private void dfs(char[][] grid, int m, int n, int i, int j){
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') return;
        else{
            grid[i][j] = '0';
            dfs(grid, m, n, i-1, j);
            dfs(grid, m, n, i+1, j);
            dfs(grid, m, n, i, j-1);
            dfs(grid, m, n, i, j+1);
        }
    }
}
