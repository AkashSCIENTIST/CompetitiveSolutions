class Solution {
    public void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.left);
        flatten(root.right);

        TreeNode right = root.right;
        TreeNode left = root.left;

        root.left = null;
        root.right = left;

        TreeNode temp = root;
        while(temp.right != null) {
            temp = temp.right;
        }
        temp.right = right;
    }
}
