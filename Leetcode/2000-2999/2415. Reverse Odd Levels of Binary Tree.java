class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left, root.right, 1);
        return root;
    }

    public void helper(TreeNode left, TreeNode right, int level) {
        if(left == null || right == null) return;
        if(level%2 == 1) {
            int val = right.val;
            right.val = left.val;
            left.val = val;
        }
        helper(left.left, right.right, level+1);
        helper(right.left, left.right, level+1);
    }
}
