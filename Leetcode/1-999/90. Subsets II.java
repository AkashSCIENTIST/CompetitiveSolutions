class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        solve(list, list2, nums, 0, nums.length);
        return list;
    }

    public void solve(List<List<Integer>> list, List<Integer> buf, int[] nums, int idx, int n) {
        if(idx == n) {
            List<Integer> temp = new LinkedList<>(buf);
            if(!list.contains(temp)) list.add(temp);
            return;
        }
        solve(list, buf, nums, idx+1, n);
        buf.add(nums[idx]);
        solve(list, buf, nums, idx+1, n);
        buf.remove(buf.size()-1);
    }
}
