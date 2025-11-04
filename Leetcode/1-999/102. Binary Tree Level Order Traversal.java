class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        while(!q.isEmpty()) {
            List<Integer> rowValues = new LinkedList<>();
            int n = q.size();

            while(n-->0) {
                TreeNode temp = q.poll();
                rowValues.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }

            res.add(rowValues);
        }

        return res;
    }
}
