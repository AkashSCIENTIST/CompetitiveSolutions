class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int index = binarySearch(nums, target, 0, n-1);
        return index;
    }

    public int binarySearch(int arr[], int target, int l, int r) {
        if(l > r) {
            if(r < 0) return l;
            else if(l < 0) return r;
            if(target  < arr[r]) return r;
            else return l;
        }

        int mid = (l+r)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return binarySearch(arr, target, l, mid-1);
        else return binarySearch(arr, target, mid+1, r);
    }
}
