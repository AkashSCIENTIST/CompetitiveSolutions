class Solution {
    public List<Integer> largestValues(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<>();
        if(root != null) q.offer(root);
        List<Integer> list = new LinkedList<>();

        while(!q.isEmpty()) {
            int val = Integer.MIN_VALUE;
            for(int i=q.size();i>0;i--) {
                TreeNode temp = q.poll();
                val = Math.max(val, temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            list.add(val);
        }

        return list;
    }
}
