class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min = 0;
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                min = Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
                triangle.get(i).set(j, triangle.get(i).get(j) + min);
            }
        }
        return triangle.get(0).get(0);
    }
}
