class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        getHeight(root);
        return diameter;
    }
    public int getHeight(TreeNode root){
        if(root == null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        diameter = Math.max(diameter, lh+rh);
        return Math.max(lh, rh)+1;
    }
}
