class Solution {
    int n;
    int arr[][];
    HashMap<String, Integer> map;
    public int minFallingPathSum(int[][] matrix) {
        map = new HashMap<String, Integer>();
        arr = matrix;
        n = arr.length;
        int val = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            val = Math.min(minFallPathSumUtil(0, i), val);
        }
        return val;
    }

    public int minFallPathSumUtil(int i, int j){
        if(i<0 || i>=n) return Integer.MAX_VALUE;
        if(j<0 || j>=n) return Integer.MAX_VALUE;
        if(i == n-1) return arr[n-1][j];
        if(map.containsKey(i + " " + j)){
            // System.out.println("yes");
            return map.get(i + " " + j);
        }
        
        int val = arr[i][j] + Math.min(
            minFallPathSumUtil(i+1, j-1),
            Math.min(
                minFallPathSumUtil(i+1, j),
                minFallPathSumUtil(i+1, j+1)
            ));
        map.put(i + " " + j, val);
        return val;
    }
}
