class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        boolean lb = isBalanced(root.left);
        boolean rb = isBalanced(root.right);
        if(lb==true && rb==true){
            if(Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1) return true;
            else return false;
        }
        else{
            return false;
        }
    }
    public int getHeight(TreeNode root){
        if(root == null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        return Math.max(lh, rh) + 1;
    }
}
