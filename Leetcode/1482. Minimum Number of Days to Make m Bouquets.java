class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)m*k) return -1;
        int right = Arrays.stream(bloomDay).max().getAsInt();
        int left = Arrays.stream(bloomDay).min().getAsInt();
        int mid;

        while(left < right) {
            mid = (left + right) / 2;
            if(isPossible(bloomDay, mid, k) >= m) {
                right = mid;
            }
            else {
                left = mid+1;
            }
        }
        return left;
    }

    public int isPossible(int[] arr, int waitDays, int k){
        int count = 0;
        int bouquets = k;

        for(int day : arr) {
            if(day > waitDays) bouquets = k;
            else if(--bouquets == 0) {
                count++;
                bouquets = k;
            }
        }
        return count;
    }
}
