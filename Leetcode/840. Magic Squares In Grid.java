class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        int n = grid.length, m = grid[0].length;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                if(isMagicSquare(grid, i, j)) count++;
            }
        }
        return count;
    }
    
    public boolean isMagicSquare(int[][] grid, int i, int j){
        String s = new String("");

        for (final int num : new int[] {0, 1, 2, 5, 8, 7, 6, 3})
            s += Integer.toString(grid[i + num / 3][j + num % 3]);

        return 
            new String("4381672943816729").contains(s) || 
            new String("9276183492761834").contains(s);
    }
}
