class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk = numBottles;
        int full, empty;

        while(numBottles >= numExchange) {
            full = numBottles/numExchange;
            empty = numBottles%numExchange;
            drunk += full;
            numBottles = full + empty;
        }

        return drunk;
    }
}
