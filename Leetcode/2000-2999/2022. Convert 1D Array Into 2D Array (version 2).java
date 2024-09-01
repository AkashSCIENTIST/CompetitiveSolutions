class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n) {
            return new int[0][0];
        }

        int[][] arr = new int[m][];

        for(int i=0; i<m; i++){
           arr[i] = Arrays.copyOfRange(original, i*n, i*n+n);
        }
        return arr;
    }
}
