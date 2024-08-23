class Solution {
    public int reversePairs(int[] nums) {
        int l = 0, r = nums.length-1;
        // System.out.println(Arrays.toString(nums));
        return countInvertions(nums, l, r);
    }

    public int countInvertions(int[] arr, int l, int r) {
        int ans = 0;
        if(l < r) {
            int mid = (l+r)/2;
            ans += countInvertions(arr, l, mid);
            ans += countInvertions(arr, mid+1, r);
            ans += countPairs(arr, l, mid, r);
            merge(arr, l, mid, r);
            // System.out.println(Arrays.toString(arr));
        }
        return ans;
    }

    public void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int a[] = new int[n1];
        int b[] = new int[n2];

        for(int i=0;i<n1;i++) a[i] = arr[l+i];
        for(int i=0;i<n2;i++) b[i] = arr[mid+i+1];

        int i=0, j=0, k=l;

        while(i<n1 && j<n2) {

            if(a[i] > b[j]) arr[k++] = b[j++];
            else arr[k++] = a[i++];
        }

        while(i<n1) arr[k++] = a[i++];;
        while(j<n2) arr[k++] = b[j++];
    }

    public int countPairs(int[] arr, int l, int mid, int r) {
        int left = l, right = mid+1;
        int ans = 0;

        for(int i=l;i<=mid;i++) {
            while ((right <= r) && ((long)arr[i] > 2 * (long)arr[right])) right++;
            ans += (right - (mid + 1));
        }

        return ans;
    }
}
