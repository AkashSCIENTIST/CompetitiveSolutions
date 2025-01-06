class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        helper(ans, list, candidates, 0, 0, target);
        return ans;

    }
    public void helper(List<List<Integer>> ans, List<Integer> list, int[] candidates, int idx, int sum, int target) {
        if(idx == candidates.length) {
            if(list.size() != 0 && sum == target) {
                ans.add(new LinkedList<>(list));
            }
            return;
        }
        else if(sum == target) {
            ans.add(new LinkedList<>(list));
            return;
        }
        else if(sum > target) {
            return;
        }
        else {
            int value = candidates[idx];
            int n = (target - sum) / value;
            for(int i=1;i<=n;i++) {
                list.add(value);
                helper(ans, list, candidates, idx+1, sum+i*value, target);
            }
            for(int i=0;i<n;i++) list.remove(list.size() - 1);
            helper(ans, list, candidates, idx+1, sum, target);   
        }
    }
}
