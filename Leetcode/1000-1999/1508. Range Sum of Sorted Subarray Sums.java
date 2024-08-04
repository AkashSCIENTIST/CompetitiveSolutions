class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        final int[] arr = new int[n*(n+1)/2];
        int index = 0;
        int sum = 0;
        final int mod = 1000000007;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum += nums[j];
                arr[index++] = sum;
            }
            sum = 0;
        }
        Arrays.sort(arr);

        sum = 0;
        for(int i=left-1;i<right;i++) sum = (sum + arr[i])%mod;
        return sum;
    }
}
