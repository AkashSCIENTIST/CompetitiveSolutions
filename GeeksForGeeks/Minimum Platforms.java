class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int i=1, j=0;
        int platforms = 1;
        int ans = 1;
        
        while(i<n && j<n) {
            if(arr[i] <= dep[j]) {
                i++;
                ans++;
            }
            else if(arr[i] > dep[j]) {
                j++;
                ans--;
            }
            if(ans > platforms) platforms = ans;
        }
        
        return platforms;
    }
}
