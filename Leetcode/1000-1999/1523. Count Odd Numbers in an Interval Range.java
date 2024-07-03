class Solution {
    public int countOdds(int low, int high) {
        return (int)((high-low)/2 + (high&1|low&1));
    }
}
