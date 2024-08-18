import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long invertions = invert(arr, 0, n-1);
        // System.out.println(Arrays.toString(arr));
        return invertions;
    }

    public static long invert(long[] arr, int l, int r) {
        long ans = 0;
        if(l < r) {
            int mid = (l+r)/2;
            ans += invert(arr, l, mid);
            ans += invert(arr, mid+1, r);
            ans += merge(arr, l, mid, r);
        }
        return ans;
    }

    public static long merge(long arr[], int l, int mid, int r) {
        long ans = 0;
        int n1 = mid - l + 1;
        int n2 = r - mid;
        long a[] = new long[n1];
        long b[] = new long[n2];

        for(int i=0; i<n1; i++){
            a[i] = arr[l+i];
        }
        for(int j=0; j<n2; j++){
            b[j] = arr[mid+j+1];
        }

        int i=0, j=0, k=l;
        while(i<n1 && j<n2) {
            if(a[i] <= b[j]) arr[k++] = a[i++];
            else {
                arr[k++] = b[j++];
                ans += (n1-i);
            }
        }

        while(i<n1) arr[k++] = a[i++];
        while(j<n2) arr[k++] = b[j++];

        return ans;
    }
}
