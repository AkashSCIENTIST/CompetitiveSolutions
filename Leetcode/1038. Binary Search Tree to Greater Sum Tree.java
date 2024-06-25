class Solution {
    int prefix = 0;
    public TreeNode bstToGst(TreeNode root) {
        reverseInorder(root);
        return root;
    }

    public void reverseInorder(TreeNode root) {
        if(root == null) return;
        reverseInorder(root.right);
        prefix += root.val;
        root.val = prefix;
        reverseInorder(root.left);
    }
}
