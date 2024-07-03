class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        else{
            TreeNode t = new TreeNode(root.val);
            t.right = invertTree(root.left);
            t.left = invertTree(root.right);
            return t;
        }
    }
}
