class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i] = 0;
            int num = i;
            while(num > 0){
                arr[i] += num&1;
                num >>>= 1;
            }
        }
        return arr;
    }
}
