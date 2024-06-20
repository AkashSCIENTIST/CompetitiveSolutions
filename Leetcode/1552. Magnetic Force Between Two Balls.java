class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = position[0], r = position[position.length-1]-position[0];
        int mid;

        while(l < r){
            mid = r - (r-l)/2;
            if(numBalls(position, mid) >= m) l = mid;
            else r = mid-1;
        }

        return l;
    }

    public int numBalls(int[] positions, int force) {
        int balls = 0;
        int prevPos = -force;
        for(int position : positions){
            if(position - prevPos >= force) {
                balls++;
                prevPos = position;
            }
        }
        return balls;
    }
}
