class Solution {
    public boolean canReach(int[] arr, int start) {
        return canReachFun(arr, start, arr.length);
    }

    public boolean canReachFun(int[] arr, int idx, int n){
        if((idx < n) && (idx >= 0) && (arr[idx] >= 0)){
            arr[idx] = -arr[idx];
            return (arr[idx] == 0) || canReachFun(arr, idx+arr[idx], n) || canReachFun(arr, idx-arr[idx], n);
        }
        return false;
    }
}
