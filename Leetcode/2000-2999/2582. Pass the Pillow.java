class Solution {
    public int passThePillow(int n, int time) {
        time %= (n + n - 2);
        if(time == 0) return 1;
        else if(time < n) return time+1;
        else {
            time -= n-1;
            return n - time;
        }
    }
}
