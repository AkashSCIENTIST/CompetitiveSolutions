class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int n = arrays.size();
        int min = 1000; // global minimum
        int max = -1000; // global maximum
        int k;
        int ans = 0; // global maximum answer
        List<Integer> temp;

        for(int i=0;i<n;i++) {
            temp = arrays.get(i);
            k = temp.size();

            // check with global max and min with local max and min before updating
            ans = Math.max(
                ans, 
                Math.max( // Local maximum answer
                    temp.get(k-1)-min,
                    max-temp.get(0)
                )
            );
            min = Math.min(min, temp.get(0));
            max = Math.max(max, temp.get(k-1));
        }

        return ans;
    }
}
