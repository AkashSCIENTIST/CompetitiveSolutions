class Solution {
    int arr[];
    public int peakIndexInMountainArray(int[] nums) {
        arr = nums;
        return search(0, nums.length-1);
    }
    public int search(int l, int r){
        if(l >= r) return l;
        int mid = (l+r)/2;
        if(arr[mid] > arr[mid+1]) return search(l, mid);
        else return search(mid+1, r);
    }
}
