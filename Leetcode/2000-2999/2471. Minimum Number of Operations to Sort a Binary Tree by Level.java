class Solution {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>(Arrays.asList(root));
        int ans = 0;

        while (!q.isEmpty()) {
            List<Integer> ids = new ArrayList<>();
            List<Integer> vals = new ArrayList<>();

            for (int i = q.size(); i > 0; --i) {
                TreeNode temp = q.poll();
                vals.add(temp.val);
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }

            for (int i = 0; i < vals.size(); i++)
                ids.add(i);
            Collections.sort(ids, (i, j) -> vals.get(i) - vals.get(j));

            for (int i = 0; i < ids.size(); ++i) {
                for (; ids.get(i) != i; ++ans) {
                    swap(ids, i, ids.get(i));
                }
            }
        }

        return ans;
    }

    public void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
