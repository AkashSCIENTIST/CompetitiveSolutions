class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int i = k;
        while(set.contains(i)) i+=k;
        return i;
    }
}
