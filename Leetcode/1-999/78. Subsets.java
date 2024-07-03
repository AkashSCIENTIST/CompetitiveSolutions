class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        help(list, 0, nums, ans);
        return ans;
    }

    public void help(List<Integer> list, int i, int[] nums, List<List<Integer>> ans){
        if(i >= nums.length) ans.add(new ArrayList<>(list));
        else {
            list.add(nums[i]);
            help(list, i+1, nums, ans);
            list.remove(list.size()-1);
            help(list, i+1, nums, ans);
        }
    }
}
