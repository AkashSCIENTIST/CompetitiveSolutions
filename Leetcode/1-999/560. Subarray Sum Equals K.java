class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix = 0;
        int ans = 0;
        int n = arr.length;
        
        for(int i=0;i<n;i++) {
            prefix += arr[i];
            ans += map.getOrDefault(prefix - k, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        
        return ans;
    }
}
