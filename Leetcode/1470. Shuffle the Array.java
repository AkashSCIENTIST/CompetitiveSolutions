class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2*n];
        int a = 0, b = 0;
        while(a < 2*n){
            arr[a] = nums[b];
            arr[1+a] = nums[b+n];
            a += 2;
            b++;
        }
        return arr;
    }
}
