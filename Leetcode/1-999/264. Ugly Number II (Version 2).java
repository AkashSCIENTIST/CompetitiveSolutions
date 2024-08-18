class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[1692];
        int i2 = 0, i3 = 0, i5 = 0, i = 0;
        arr[i] = 1;
        int next;

        while(i < n) {
            next = Math.min(arr[i2]*2, Math.min(arr[i3]*3, arr[i5]*5));
            arr[++i] = next;
            if(next == arr[i2]*2) i2++;
            if(next == arr[i3]*3) i3++;
            if(next == arr[i5]*5) i5++;
        }

        return arr[n-1];
    }
}
