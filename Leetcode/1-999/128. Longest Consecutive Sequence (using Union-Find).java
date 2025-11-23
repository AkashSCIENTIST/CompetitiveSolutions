class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        HashMap<Integer, Integer> rank = new HashMap<>();
        HashMap<Integer, Integer> parent = new HashMap<>();

        for(int i : nums) {
            rank.put(i, 1);
            parent.put(i, i);
        }

        for(int i : nums){
            if(parent.containsKey(i-1)) union(parent, rank, i-1, i);
            if(parent.containsKey(i+1)) union(parent, rank, i+1, i);
        }

        int max = 0;
        for(int num : parent.keySet()) {
            if(find(num, parent) == num) max = Math.max(max, rank.get(num));
        }

        return max;
    }

    private int find(int num, HashMap<Integer, Integer> parent) {
        if(parent.get(num) != num) {
            parent.put(num, find(parent.get(num), parent));
        }
        return parent.get(num);
    }

    private void union(HashMap<Integer, Integer> parent, HashMap<Integer, Integer> rank, int num1, int num2) {
        int root1 = find(num1, parent);
        int root2 = find(num2, parent);

        if(root1 != root2) {
            if(root1 > root2) {
                parent.put(root2, root1);
                rank.put(root1, rank.get(root1) + rank.get(root2));
            }
            else {
                parent.put(root1, root2);
                rank.put(root2, rank.get(root1) + rank.get(root2));
            }
        }
    }
}
