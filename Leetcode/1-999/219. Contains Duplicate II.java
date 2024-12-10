class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        int n = nums.length;

        for(int i=0;i<n;i++) {
            if (!seen.add(nums[i])) return true;
            if (i >= k) seen.remove(nums[i - k]);
        }

        return false;
    }
}
