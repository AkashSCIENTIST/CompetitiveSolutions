class Solution {
    int maxLen(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int size = 0;
        int n = arr.length;
        
        for(int i=0;i<n;i++) {
            sum += arr[i];
            if(sum == 0) size = Math.max(size, i+1);
            else if(map.containsKey(sum)) {
                size = Math.max(size, i - map.get(sum));
            }
            else {
                map.put(sum, i);
            }
        }
        
        return size;
    }
}
