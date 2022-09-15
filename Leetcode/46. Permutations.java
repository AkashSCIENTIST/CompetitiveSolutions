class Solution {
    public void backtrack(List<List<Integer>> ans, int[] nums, List<Integer> temp){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
        }
        else{
            for(int i : nums){
                if(temp.contains(i)) continue;
                temp.add(i);
                backtrack(ans, nums, temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        backtrack(ans, nums, new LinkedList<>());
        return ans;
    }
}
