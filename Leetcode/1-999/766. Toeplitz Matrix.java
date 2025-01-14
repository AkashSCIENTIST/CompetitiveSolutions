class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i+1<m;i++) {
            for(int j=0;j+1<n;j++) {
                if(matrix[i][j] != matrix[i+1][j+1]) return false;
            }
        }

        return true;
    }
}
