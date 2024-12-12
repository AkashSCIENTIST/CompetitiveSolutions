class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int ans = 1;
        int n = points.length;
        int[] pointX = points[0];

        for(int i=1;i<n;i++) {
            if(points[i][0] > pointX[1]) {
                ans++;
                pointX = points[i];
            }

        }

        return ans;
    }
}
