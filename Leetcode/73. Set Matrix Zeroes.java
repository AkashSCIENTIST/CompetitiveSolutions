class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean status[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0) status[i][j] = true;
                else status[i][j] = false;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(status[i][j]){
                    for(int x=0;x<n;x++) matrix[x][j] = 0;
                    for(int y=0;y<m;y++) matrix[i][y] = 0;
                }
            }
        }
    }
}
