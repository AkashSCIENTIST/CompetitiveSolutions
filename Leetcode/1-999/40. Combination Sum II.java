class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        Arrays.sort(candidates);
        List<Integer> new_list = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            // if (new_list.size() == 0)
            //     new_list.add(candidates[0]);
            // else if (new_list.get(new_list.size() - 1) != candidates[i])
                new_list.add(candidates[i]);
        }
        System.out.println(new_list);
        helper(ans, list, new_list, 0, 0, target);
        return ans;
    }

    public void helper(List<List<Integer>> ans, List<Integer> list, List<Integer> new_list, int idx, int sum,  int target) {
        if (idx == new_list.size()) {
            if (list.size() != 0 && sum == target) {
                ans.add(new LinkedList<>(list));
            }
            return;
        } else if (sum == target) {
            ans.add(new LinkedList<>(list));
            return;
        } else if (sum > target) {
            return;
        } else {
            int value = new_list.get(idx);
            list.add(value);
            helper(ans, list, new_list, idx + 1, sum + value, target);
            list.remove(list.size() - 1);

            while(idx<new_list.size()-1 && new_list.get(idx)==new_list.get(idx+1)) idx++;

            helper(ans, list, new_list, idx + 1, sum, target);
        }
    }
}
