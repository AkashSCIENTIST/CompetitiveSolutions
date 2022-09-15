class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int i = 0;
        for(int[] arr : matrix){
            if(target <= arr[n-1]) break;
            else i++;
        }
        if(i == matrix.length) return false;
        for(int j : matrix[i]){
            if(j == target) return true;
        }
        return false;
    }
}
